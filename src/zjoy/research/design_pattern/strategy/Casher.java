package zjoy.research.design_pattern.strategy;

public class Casher {

	public static void main(String[] args) {
		
		StrategyFactory factory = new StrategyFactory(StrategyType.normal.getType());
		CashCalculator calculator = new CashCalculator(factory.getInstance());
		double result = calculator.cash(1000);
		System.out.println(result);
		
		
	}
}
