package Study.DesignPattern.factory.abstractfactory;

import Study.DesignPattern.factory.abstractfactory.factory.BJPizzaFactory;
import Study.DesignPattern.factory.abstractfactory.factory.LDPizzaFactory;

public class OrderClient {
	public static void main(String[] args) {
		BJPizzaFactory bjPizzaFactory = new BJPizzaFactory();
		bjPizzaFactory.createCheesePizza();
		System.out.println("--------------------------------");
		bjPizzaFactory.createPepperPizza();
		System.out.println("===============");
		LDPizzaFactory ldPizzaFactory = new LDPizzaFactory();
		ldPizzaFactory.createCheesePizza();
		System.out.println("--------------------------------");
		ldPizzaFactory.createPepperPizza();
	}

}
