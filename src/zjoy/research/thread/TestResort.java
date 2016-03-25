package zjoy.research.thread;

public class TestResort {

	static int a = 0;
	boolean flag = false;

	public void writer() {
		a = 1; // 1
		flag = true; // 2
	}

	public void reader() {
	    if (flag) {                //3
	        int i =  a * a;        //4
	        System.out.println("hear");
	    }
	}
	
	public static void main(String[] args) {
		
		TestResort sort = new TestResort();
		
		Thread t1 = new Thread(){
			public void run(){
				sort.writer();
			}
		};
		
		t1.start();
		
		Thread t2 = new Thread(){
			public void run(){
				sort.reader();
			}
		};
		t2.start();
		
		
		System.out.println("i:===="+a);
		
	}

}
