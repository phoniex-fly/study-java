package org.study.DesignPattern.decorator.demoC;

import org.study.DesignPattern.decorator.demoC.component.ChineseCoffee;
import org.study.DesignPattern.decorator.demoC.component.Coffee;
import org.study.DesignPattern.decorator.demoC.decorator.BatchingMilk;
import org.study.DesignPattern.decorator.demoC.decorator.BatchingSugar;

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
