package Study.DesignPattern.visitor.element;

import Study.DesignPattern.visitor.action.Action;

public abstract class Person {
	
	public abstract void accept(Action action) ;
}
