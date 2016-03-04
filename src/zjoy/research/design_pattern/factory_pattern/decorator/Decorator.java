package zjoy.research.design_pattern.factory_pattern.decorator;

public abstract class Decorator implements Weaable{

	protected Weaable wear;
	
	public void setWearable(Weaable wear){
		this.wear = wear;
	}
	
	public void wear(){
		wear.wear();
	}
	
	
}
