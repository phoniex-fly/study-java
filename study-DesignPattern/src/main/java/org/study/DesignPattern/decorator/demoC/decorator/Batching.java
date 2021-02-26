package org.study.DesignPattern.decorator.demoC.decorator;

import org.study.DesignPattern.decorator.demoC.component.Coffee;

public class Batching extends Coffee {

	private Coffee coffee;

	public Batching(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public int money() {
		return super.getPrice() + coffee.money();
	}

	@Override
	public String desc() {
		return super.getName() + "的" + coffee.desc();
	}

}
