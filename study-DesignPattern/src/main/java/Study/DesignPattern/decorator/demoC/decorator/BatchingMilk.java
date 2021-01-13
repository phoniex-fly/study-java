package Study.DesignPattern.decorator.demoC.decorator;

import Study.DesignPattern.decorator.demoC.component.Coffee;

public class BatchingMilk extends Batching {

	public BatchingMilk(Coffee coffee) {
		super(coffee);
		setName("加牛奶");
		setPrice(1);
	}

}
