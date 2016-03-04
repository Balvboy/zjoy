package zjoy.research.design_pattern.strategy;
/**
 * 策略的工厂
 * @author zhouyang
 *
 */
public class StrategyFactory {
	
	private int type;

	public StrategyFactory(int type){
		
		this.type = type;
		
	}
	
	public CashCalculateStrategy getInstance(){
		
		switch (type) {
		case 0:
			return new SaleStrategy(1);
		case 1:
			return new SaleStrategy(0.9);
		default:
			return new SaleStrategy(0.8);
		}
	}
	
}
