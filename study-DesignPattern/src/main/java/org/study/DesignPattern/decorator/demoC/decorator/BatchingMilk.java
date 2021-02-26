package org.study.DesignPattern.decorator.demoC.decorator;

import org.study.DesignPattern.decorator.demoC.component.Coffee;

public class BatchingMilk extends Batching {

	public BatchingMilk(Coffee coffee) {
		super(coffee);
		setName("加牛奶");
		setPrice(1);
	}

}
