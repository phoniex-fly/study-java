package Study.DesignPattern.decorator.demoC.component;

public class ChineseCoffee extends Coffee {

	public ChineseCoffee() {
		super.setName("中式咖啡");
		super.setPrice(10);
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
