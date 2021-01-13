package Study.DesignPattern.factory.simplefactory.product;

public class CheesePizza extends Pizza{

	public CheesePizza() {
		super("胡椒pizza");
	}

	@Override
	public void add() {
		System.out.println("添加胡椒pizza原材料");
	}

}
