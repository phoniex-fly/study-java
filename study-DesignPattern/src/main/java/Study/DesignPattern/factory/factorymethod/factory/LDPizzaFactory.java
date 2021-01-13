package Study.DesignPattern.factory.factorymethod.factory;

import Study.DesignPattern.factory.factorymethod.product.LDCheesePizza;
import Study.DesignPattern.factory.factorymethod.product.Pizza;

public class LDPizzaFactory implements PizzaFactory{

	@Override
	public void createPizza() {
		Pizza pizza =  new LDCheesePizza();
			pizza.add();
			pizza.bak();
			pizza.done();
		
	}

	

}
