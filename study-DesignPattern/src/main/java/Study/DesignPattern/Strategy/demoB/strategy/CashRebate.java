package Study.DesignPattern.Strategy.demoB.strategy;

import Study.DesignPattern.Strategy.demoB.CashStrategy;

public class CashRebate extends CashStrategy {

	private static double rebate = 0.1;

	@Override
	public double getSalePrice(double price) {
		return price * rebate;
	}

}
