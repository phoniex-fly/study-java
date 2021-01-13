package Study.DesignPattern.factory.abstractfactory.product;

public class BJPepperPizza extends Pizza{

	public BJPepperPizza() {
		super("北京胡椒pizza");
	}

	@Override
	public void add() {
		System.out.println("北京添加胡椒pizza原材料");
	}

}
