package Study.DesignPattern.factory.abstractfactory.product;

public class LDCheesePizza extends Pizza{

	public LDCheesePizza() {
		super("伦敦奶酪pizza");
	}

	@Override
	public void add() {
		System.out.println("伦敦添加奶酪pizza原材料");
	}

}
