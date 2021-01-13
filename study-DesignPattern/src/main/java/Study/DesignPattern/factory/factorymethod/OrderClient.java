package Study.DesignPattern.factory.factorymethod;

import Study.DesignPattern.factory.factorymethod.factory.BJPizzaFactory;
import Study.DesignPattern.factory.factorymethod.factory.LDPizzaFactory;

public class OrderClient {
	public static void main(String[] args) {
		BJPizzaFactory bjPizzaFactory = new BJPizzaFactory();
		bjPizzaFactory.createPizza();
		System.out.println("===============");
		LDPizzaFactory ldPizzaFactory = new LDPizzaFactory();
		ldPizzaFactory.createPizza();
	}

}
