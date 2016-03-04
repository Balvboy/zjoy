package zjoy.research.design_pattern;

import zjoy.research.design_pattern.factory_pattern.simpleFactory.AnimalFactory;
import zjoy.research.design_pattern.factory_pattern.simpleFactory.Moveable;
import zjoy.research.design_pattern.factory_pattern.simpleFactory.MoveableFactory;
import zjoy.research.design_pattern.single_pattern.SinglePatternWithStaticInnerClass;

public class TestDesignPattern {

	public static void main(String[] args) {
		
		//单例模式
		SinglePatternWithStaticInnerClass singleOne = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		SinglePatternWithStaticInnerClass singleTwo = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		System.out.println(singleOne == singleTwo);
		
		//工厂模式
		MoveableFactory mfactory = new AnimalFactory();
		Moveable move = mfactory.create();
		move.run();
		
		//spring
		
		
	}
}
