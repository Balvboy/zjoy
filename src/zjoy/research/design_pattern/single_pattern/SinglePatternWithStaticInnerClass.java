package zjoy.research.design_pattern.single_pattern;

/**
 * 
 * @Title: SinglePatternWithStaticInnerClass.java 
 * @projectName zjoy
 * @Description: 使用静态内部类创建 懒汉式 ，支持多线程 的单例模式
 * @date 2016年3月3日 下午3:25:35 
 * @version V1.0   
 * @author zhouyang
 */
public class SinglePatternWithStaticInnerClass {

	public static SinglePatternWithStaticInnerClass getSinglePatternInstance(){
		return InnerClass.singlePattern;
	}
	
	private static class InnerClass{
		
		private static final SinglePatternWithStaticInnerClass singlePattern = new SinglePatternWithStaticInnerClass();
		
	}
	
}
