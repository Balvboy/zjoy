package zjoy.research.thread;

public class TestVolatile {

	private static volatile boolean flag = true;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(){
			
			public void run(){
				while(flag){
					//System.out.println("running");
				}
			}
		};
		
		thread.start();
		
		Thread.sleep(1000);
		
		flag = false;
		
		
	}
	
}



