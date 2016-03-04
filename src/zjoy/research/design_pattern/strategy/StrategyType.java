package zjoy.research.design_pattern.strategy;

/**
 * 策略类型，应该和策略的个数相对应，主要是为了在调用的时候知道每个数字代表什么意思
 * @author zhouyang
 *
 */
public enum StrategyType {

	
	normal(0),saleType(1),returnType(2);
	
	private int type;
	
	private StrategyType(int type){
		this.type = type;
	}
	
	public int getType(){
		return this.type;
	}
}
