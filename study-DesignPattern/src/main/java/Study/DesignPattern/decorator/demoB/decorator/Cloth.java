package Study.DesignPattern.decorator.demoB.decorator;

import Study.DesignPattern.decorator.demoB.component.Person;

public abstract class Cloth extends Person {

	protected Person person;

	public Cloth(Person person) {
		super(person.getName());
		this.person = person;
	}

	/**
	 * 自身装饰内容
	 */
	public abstract void wearCloth();

	/**
	 * 装饰方法
	 */
	public void decorate() {
		person.decorate();
	};

}
