package zjoy.research.design_pattern.factory_pattern.simpleFactory;

public class HumanFactory implements MoveableFactory {

	@Override
	public Moveable create() {
		return new Human();
	}

}
