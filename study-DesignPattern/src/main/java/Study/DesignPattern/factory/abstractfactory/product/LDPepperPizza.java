package Study.DesignPattern.factory.abstractfactory.product;

public class LDPepperPizza extends Pizza{

	public LDPepperPizza() {
		super("伦敦胡椒pizza");
	}

	@Override
	public void add() {
		System.out.println("伦敦添加胡椒pizza原材料");
	}

}
