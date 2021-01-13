package Study.DesignPattern.visitor.element;

import Study.DesignPattern.visitor.action.Action;

public class Man extends Person{

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}
