package zjoy.research.thread;

public class PrintABC {

	public static void main(String[] args) {
		
	}
	
}

class PrintThread extends Thread{
	
	private String content;
	private Object lock;
	
	public PrintThread(String content,Object lock){
		this.content = content;
		this.lock = lock;
	}
	
	public void run(){
		System.out.println(content);
	}
}
