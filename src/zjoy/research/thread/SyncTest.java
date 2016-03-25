package zjoy.research.thread;

public class SyncTest {

	private Object lock = new Object();
	
	public  void say(){
		synchronized (SyncTest.class) {
			System.out.println(Thread.currentThread().getName()+":hello");
			System.out.println("睡眠5s");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void hello(){
		
		System.out.println("nihao");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SyncTest test = new SyncTest();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				test.say();
			}
		};
		
		t1.setName("t1");
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				test.say();
			}
		};
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				test.hello();
			}
		};
		
		t2.setName("t2");
		
		t1.start();
		t2.start();
		Thread.sleep(500);
		t3.start();
		
	}
	
}
