package zjoy.research.design_pattern.strategy;

/**
 * 策略算法的具体实现
 * @author zhouyang
 *
 */
public class SaleStrategy implements CashCalculateStrategy {
	
	private double saleLevel;
	
	public SaleStrategy(double level){
		this.saleLevel = level;
	}

	@Override
	public double calculate(double price) {
		return saleLevel*price;
	}

}
