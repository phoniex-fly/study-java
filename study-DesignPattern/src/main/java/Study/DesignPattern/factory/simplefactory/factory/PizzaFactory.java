package Study.DesignPattern.factory.simplefactory.factory;

import Study.DesignPattern.factory.simplefactory.product.CheesePizza;
import Study.DesignPattern.factory.simplefactory.product.PepperPizza;
import Study.DesignPattern.factory.simplefactory.product.Pizza;

public class PizzaFactory {

	public static void createPizza(String name) {
		Pizza pizza = null;
		if ("pepper".equals(name)) {
			pizza = new PepperPizza();
		} else if ("cheese".equals(name)) {
			pizza = new CheesePizza();
		}
		if (pizza != null) {
			pizza.add();
			pizza.bak();
			pizza.done();
		}
	}

}
