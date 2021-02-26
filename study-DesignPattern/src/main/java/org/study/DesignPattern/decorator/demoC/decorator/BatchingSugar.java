package org.study.DesignPattern.decorator.demoC.decorator;

import org.study.DesignPattern.decorator.demoC.component.Coffee;

public class BatchingSugar extends Batching {

	public BatchingSugar(Coffee coffee) {
		super(coffee);
		setName("加糖");
		setPrice(2);
	}

}
