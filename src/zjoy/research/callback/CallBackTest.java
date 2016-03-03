package zjoy.research.callback;

public class CallBackTest {

	public static void main(String[] args) {
		
		Caller call = new Caller(new MyCallable() {
			
			@Override
			public void callbackMethod() {
				System.out.println("my first call back method");
			}
		});
		
		call.call();
		
	}
}
