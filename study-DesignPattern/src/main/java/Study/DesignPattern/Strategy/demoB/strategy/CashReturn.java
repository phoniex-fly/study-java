package Study.DesignPattern.Strategy.demoB.strategy;

import Study.DesignPattern.Strategy.demoB.CashStrategy;

public class CashReturn extends CashStrategy {

	private static double moneyConditation = 300;
	private static double moneyReturn = 100;

	@Override
	public double getSalePrice(double price) {
		if (price >= moneyConditation) {
			return price + moneyReturn;
		}
		return 0;
	}

}
