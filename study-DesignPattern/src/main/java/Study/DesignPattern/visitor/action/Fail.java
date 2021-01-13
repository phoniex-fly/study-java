package Study.DesignPattern.visitor.action;

import Study.DesignPattern.visitor.element.Man;
import Study.DesignPattern.visitor.element.Woman;

public class Fail extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("man的评价不成功");
		
	}

	@Override
	public void getWomanResult(Woman man) {
		System.out.println("woman的评价不成功");
	}

}
