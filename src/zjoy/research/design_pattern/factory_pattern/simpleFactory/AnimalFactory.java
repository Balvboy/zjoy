package zjoy.research.design_pattern.factory_pattern.simpleFactory;

public class AnimalFactory implements MoveableFactory {

	@Override
	public Moveable create() {
		return new Animal();
	}

}
