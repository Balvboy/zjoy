package zjoy.research.design_pattern.single_pattern;

public class TestSingleton {
	public static void main(String[] args) {
		
		
		SinglePatternWithStaticInnerClass single1 = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		SinglePatternWithStaticInnerClass single2 = SinglePatternWithStaticInnerClass.getSinglePatternInstance();
		
		System.out.println(single1==single2);
	}
}
