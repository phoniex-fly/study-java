package Study.DesignPattern.factory.abstractfactory.product;

public class BJCheesePizza extends Pizza{

	public BJCheesePizza() {
		super("北京奶酪pizza");
	}

	@Override
	public void add() {
		System.out.println("北京添加奶酪pizza原材料");
	}

}
