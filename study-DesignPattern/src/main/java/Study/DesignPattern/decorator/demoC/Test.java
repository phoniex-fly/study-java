package Study.DesignPattern.decorator.demoC;

import Study.DesignPattern.decorator.demoC.component.ChineseCoffee;
import Study.DesignPattern.decorator.demoC.component.Coffee;
import Study.DesignPattern.decorator.demoC.decorator.BatchingMilk;
import Study.DesignPattern.decorator.demoC.decorator.BatchingSugar;

public class Test {
	public static void main(String[] args) {
		Coffee coffee = new ChineseCoffee();
		System.out.println(coffee.money());
		System.out.println(coffee.desc());

		coffee = new BatchingMilk(coffee);
		System.out.println(coffee.money());
		System.out.println(coffee.desc());

		coffee = new BatchingSugar(coffee);
		System.out.println(coffee.money());
		System.out.println(coffee.desc());
	}

}
