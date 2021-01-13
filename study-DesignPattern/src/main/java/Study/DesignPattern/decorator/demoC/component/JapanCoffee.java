package Study.DesignPattern.decorator.demoC.component;

public class JapanCoffee extends Coffee {

	public JapanCoffee() {
		super.setName("日式咖啡");
		super.setPrice(5);
	}

	@Override
	public int money() {
		return super.getPrice();
	}

	@Override
	public String desc() {
		return super.getName() + "价格为" + this.money() + "元";
	}

}
