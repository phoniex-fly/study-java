package Study.DesignPattern.factory.simplefactory.product;

public class PepperPizza extends Pizza{

	public PepperPizza() {
		super("奶酪pizza");
	}

	@Override
	public void add() {
		System.out.println("添加奶酪pizza原材料");
	}

}
