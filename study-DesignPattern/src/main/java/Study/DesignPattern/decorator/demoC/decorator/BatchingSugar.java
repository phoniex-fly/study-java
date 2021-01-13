package Study.DesignPattern.decorator.demoC.decorator;

import Study.DesignPattern.decorator.demoC.component.Coffee;

public class BatchingSugar extends Batching {

	public BatchingSugar(Coffee coffee) {
		super(coffee);
		setName("加糖");
		setPrice(2);
	}

}
