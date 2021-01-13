package Study.DesignPattern.factory.factorymethod.factory;

import Study.DesignPattern.factory.factorymethod.product.BJPepperPizza;
import Study.DesignPattern.factory.factorymethod.product.Pizza;

public class BJPizzaFactory implements PizzaFactory{

	@Override
	public void createPizza() {
		Pizza pizza =  new BJPepperPizza();
			pizza.add();
			pizza.bak();
			pizza.done();
		
	}

	

}
