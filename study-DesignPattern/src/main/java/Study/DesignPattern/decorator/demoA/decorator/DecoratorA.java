package Study.DesignPattern.decorator.demoA.decorator;

import Study.DesignPattern.decorator.demoA.component.Component;

public class DecoratorA extends Decorator {

	public DecoratorA(Component component) {
		super(component);
	}

	public void decorateBeforeMethod() {
		System.out.println("A装饰---方法前装饰");
	}

	public void decorateAfterMethod() {
		System.out.println("A装饰---方法后装饰");
	}

	@Override
	public void operation() {
		this.decorateBeforeMethod();
		super.operation();
		this.decorateAfterMethod();
	}

}
