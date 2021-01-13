package Study.DesignPattern.decorator.demoB.decorator;

import Study.DesignPattern.decorator.demoB.component.Person;

public class Dress extends Cloth {

	public Dress(Person person) {
		super(person);
	}

	@Override
	public void wearCloth() {
		System.out.println("-------穿裙子");
	}

	@Override
	public void decorate() {
		super.decorate();
		this.wearCloth();
	}

}
