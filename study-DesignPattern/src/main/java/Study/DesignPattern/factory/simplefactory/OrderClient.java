package Study.DesignPattern.factory.simplefactory;

import Study.DesignPattern.factory.simplefactory.factory.PizzaFactory;

public class OrderClient {
	public static void main(String[] args) {
		PizzaFactory.createPizza("pepper");
		System.out.println("===============");
		PizzaFactory.createPizza("cheese");
	}

}
