package Study.DesignPattern.Strategy.demoB.strategy;

import Study.DesignPattern.Strategy.demoB.CashStrategy;

public class CashNormal extends CashStrategy {

	@Override
	public double getSalePrice(double price) {
		return price;
	}

}
