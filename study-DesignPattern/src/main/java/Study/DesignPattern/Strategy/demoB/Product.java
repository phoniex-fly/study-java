package Study.DesignPattern.Strategy.demoB;

public class Product {

	private CashStrategy cashStrategy;

	public Product(CashStrategy cashStrategy) {
		super();
		this.cashStrategy = cashStrategy;
	}

	/**
	 * 获取活动价格
	 * 
	 * @param price
	 * @return
	 */
	public double getSalePrice(double price) {
		return cashStrategy.getSalePrice(price);
	}

}
