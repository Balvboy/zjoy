package zjoy.research.callback;

public class Caller {

	private MyCallable call;
	
	public Caller(MyCallable call){
		this.call = call;
	}
	
	
	
	public void call(){
		call.callbackMethod();
	}
}
