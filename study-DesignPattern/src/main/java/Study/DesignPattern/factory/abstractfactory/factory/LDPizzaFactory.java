package Study.DesignPattern.factory.abstractfactory.factory;

import Study.DesignPattern.factory.abstractfactory.product.LDCheesePizza;
import Study.DesignPattern.factory.abstractfactory.product.LDPepperPizza;
import Study.DesignPattern.factory.abstractfactory.product.Pizza;

public class LDPizzaFactory implements PizzaFactory{

	@Override
	public void createCheesePizza() {
		Pizza pizza =  new LDCheesePizza();
		pizza.add();
		pizza.bak();
		pizza.done();
		
	}

	@Override
	public void createPepperPizza() {
		Pizza pizza =  new LDPepperPizza();
		pizza.add();
		pizza.bak();
		pizza.done();
		
	}
	

}
