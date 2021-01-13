package Study.DesignPattern.decorator.demoC.component;

public abstract class Coffee {

	public String name;

	public int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 计算价格
	 * 
	 * @return
	 */
	abstract public int money();

	/**
	 * 描述
	 * 
	 * @return
	 */
	abstract public String desc();

}
