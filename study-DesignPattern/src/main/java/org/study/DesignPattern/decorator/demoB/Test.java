package org.study.DesignPattern.decorator.demoB;

import Study.DesignPattern.decorator.demoB.component.Person;
import Study.DesignPattern.decorator.demoB.decorator.Cloth;
import org.study.DesignPattern.decorator.demoB.decorator.Dress;
import org.study.DesignPattern.decorator.demoB.decorator.Shoes;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("张三");

		Cloth dress = new Dress(person);

		Cloth shoes = new Shoes(dress);

		shoes.decorate();

	}

}
