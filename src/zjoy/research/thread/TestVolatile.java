package zjoy.research.thread;

import java.util.Hashtable;

public class TestVolatile {

	private static  boolean flag = true;
	private static int a = 0;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(){
			
			public void run(){
				while(flag){
					System.out.println("running");
					
				}
			}
		};
		
		thread.start();
		
		Thread.sleep(1000);
		
		flag = false;
		
	}
	
}



