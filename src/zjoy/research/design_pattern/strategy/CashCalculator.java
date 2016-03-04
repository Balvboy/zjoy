package zjoy.research.design_pattern.strategy;

public class  CashCalculator{
	
	private CashCalculateStrategy strategy;
	
	
	public CashCalculator(CashCalculateStrategy strategy){
		this.strategy = strategy;
	}
	
	
	public double cash(double cash){
		return strategy.calculate(cash);
	}
	
	
}
