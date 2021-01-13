package Study.DesignPattern.decorator.demoA.decorator;

import Study.DesignPattern.decorator.demoA.component.Component;

public abstract class Decorator extends Component {

	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}

}
