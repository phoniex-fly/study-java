package Study.DesignPattern.visitor.action;

import Study.DesignPattern.visitor.element.Man;
import Study.DesignPattern.visitor.element.Woman;

public abstract class Action {
	
	public abstract void getManResult(Man man);
	
	public abstract void getWomanResult(Woman man);

}
