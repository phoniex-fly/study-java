package Study.DesignPattern.decorator.demoB.decorator;

import Study.DesignPattern.decorator.demoB.component.Person;

public class Shoes extends Cloth {

	public Shoes(Person person) {
		super(person);
	}

	@Override
	public void wearCloth() {
		System.out.println("-----------穿鞋子");
	}

	@Override
	public void decorate() {
		super.decorate();
		this.wearCloth();
	}

}
