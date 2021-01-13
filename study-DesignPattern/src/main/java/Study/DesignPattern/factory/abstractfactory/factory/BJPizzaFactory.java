package Study.DesignPattern.factory.abstractfactory.factory;

import Study.DesignPattern.factory.abstractfactory.product.BJCheesePizza;
import Study.DesignPattern.factory.abstractfactory.product.BJPepperPizza;
import Study.DesignPattern.factory.abstractfactory.product.Pizza;

public class BJPizzaFactory implements PizzaFactory{

	@Override
	public void createCheesePizza() {
		Pizza pizza =  new BJCheesePizza();
		pizza.add();
		pizza.bak();
		pizza.done();
		
	}

	@Override
	public void createPepperPizza() {
		Pizza pizza =  new BJPepperPizza();
		pizza.add();
		pizza.bak();
		pizza.done();
		
	}

	

	

}
