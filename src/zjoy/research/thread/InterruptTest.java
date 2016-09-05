package zjoy.research.thread;

public class InterruptTest {

	private volatile static boolean stop = false;
	
	public static void main(String[] args) throws InterruptedException {
		Runnable t = new Runnable() {
			public void run() {
				while(!stop){
					try {
						System.out.println("线程进入睡眠");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
//						System.out.println("处理中断异常");
						e.printStackTrace();
					}
				}
				System.out.println("线程跳出while继续执行");
			}
		};
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(1000);
		System.out.println("调用interrupt方法");
		stop = true;
		Thread.sleep(100);
		t1.interrupt();
		Thread.sleep(200);
		System.out.println("线程t1的终端状态" + t1.isInterrupted());
	}
}

class Example1 extends Thread {
	boolean stop = false;

	public static void main(String args[]) throws Exception {
		Example1 thread = new Example1();
		System.out.println("Starting thread...");
		thread.start();
		Thread.sleep(3000);
		System.out.println("Interrupting thread...");
		thread.interrupt();
		Thread.sleep(3000);
		System.out.println("Stopping application...");
		// System.exit(0);
	}

	public void run() {
		while (!stop) {
			System.out.println("Thread is running...");
			long time = System.currentTimeMillis();
			while ((System.currentTimeMillis() - time < 1000)) {
			}
		}
		System.out.println("Thread exiting under request...");
	}
}
