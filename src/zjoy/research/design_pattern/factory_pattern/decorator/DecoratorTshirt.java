package zjoy.research.design_pattern.factory_pattern.decorator;

public class DecoratorTshirt extends Decorator{
	
	@Override
	public void wear() {
		wear.wear();
		System.out.println("穿上Tshirt");
	}

	
}
