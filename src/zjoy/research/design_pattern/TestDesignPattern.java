package zjoy.research.design_pattern;

import zjoy.research.design_pattern.single_pattern.SinglePatternWithStaticInnerClass;

public class TestDesignPattern {

	public static void main(String[] args) {
		
		
		SinglePatternWithStaticInnerClass singleOne = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		
		SinglePatternWithStaticInnerClass singleTwo = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		
		System.out.println(singleOne == singleTwo);
		
		
	}
}
