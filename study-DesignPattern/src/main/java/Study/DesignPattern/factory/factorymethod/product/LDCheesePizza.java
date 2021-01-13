package Study.DesignPattern.factory.factorymethod.product;

public class LDCheesePizza extends Pizza{

	public LDCheesePizza() {
		super("伦敦胡椒pizza");
	}

	@Override
	public void add() {
		System.out.println("伦敦添加胡椒pizza原材料");
	}

}
