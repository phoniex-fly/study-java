package Study.DesignPattern.decorator.demoA.decorator;

import Study.DesignPattern.decorator.demoA.component.Component;

public class DecoratorB extends Decorator {

	public DecoratorB(Component component) {
		super(component);
	}

	public void decorateBeforeMethod() {
		System.out.println("B装饰---方法前装饰");
	}

	public void decorateAfterMethod() {
		System.out.println("B装饰---方法后装饰");
	}

	@Override
	public void operation() {
		this.decorateBeforeMethod();
		super.operation();
		this.decorateAfterMethod();
	}

}
