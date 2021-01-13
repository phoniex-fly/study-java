package Study.DesignPattern.factory.factorymethod.product;

public class BJPepperPizza extends Pizza{

	public BJPepperPizza() {
		super("北京奶酪pizza");
	}

	@Override
	public void add() {
		System.out.println("北京添加奶酪pizza原材料");
	}

}
