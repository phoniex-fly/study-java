package Study.DesignPattern.Strategy.demoB;

import Study.DesignPattern.Strategy.demoB.strategy.CashNormal;
import Study.DesignPattern.Strategy.demoB.strategy.CashRebate;
import Study.DesignPattern.Strategy.demoB.strategy.CashReturn;

public class Test {
	public static void main(String[] args) {
		Product product = null;
		product = new Product(new CashNormal());
		double salePrice = product.getSalePrice(400);
		System.out.println(salePrice);

		product = new Product(new CashRebate());
		double salePrice2 = product.getSalePrice(400);
		System.out.println(salePrice2);

		product = new Product(new CashReturn());
		double salePrice3 = product.getSalePrice(400);
		System.out.println(salePrice3);
	}

}
