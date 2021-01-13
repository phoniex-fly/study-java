package Study.DesignPattern.visitor.element;

import Study.DesignPattern.visitor.action.Action;

public class Woman extends Person{

	@Override
	public void accept(Action action) {
		action.getWomanResult(this);
	}

}
