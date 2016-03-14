package zjoy.utils.threadUtil;

public class MyThreadLocal {

	public static  String name = "zhou";
	static ThreadLocal<String> threadlocal = new ThreadLocal<String>() {

		@Override
		protected String initialValue() {
			System.out.println(1);
			return name;
		}

	};
	public void createThreadLocal(int num) {
		
		for (int i = 0; i < num; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					String str = threadlocal.get();
					System.out.println( Thread.currentThread().getName());
					str = Thread.currentThread().getName()+str;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(str);
				}
			}).start();;
		}
		
	}
	
	
	public void createThreads(int num){
		for (int i = 0; i < num; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized (name) {
						try {
							Thread.sleep(1000);
							System.out.println(name);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();; 	
		}

	}
	

	public static void main(String[] args) {
		new MyThreadLocal().createThreadLocal(4);
		//new MyThreadLocal().createThreads(2);
	}

}
