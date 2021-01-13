package Study.DesignPattern.decorator.demoA;

import Study.DesignPattern.decorator.demoA.component.Component;
import Study.DesignPattern.decorator.demoA.component.ComponentA;
import Study.DesignPattern.decorator.demoA.decorator.Decorator;
import Study.DesignPattern.decorator.demoA.decorator.DecoratorA;
import Study.DesignPattern.decorator.demoA.decorator.DecoratorB;

public class Test {

	public static void main(String[] args) {
		Component component = new ComponentA();

		Decorator A = new DecoratorA(component);

		Decorator B = new DecoratorB(A);

		B.operation();

	}

}
