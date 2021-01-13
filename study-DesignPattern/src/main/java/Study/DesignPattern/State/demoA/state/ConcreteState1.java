package Study.DesignPattern.State.demoA.state;

import Study.DesignPattern.State.demoA.State;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		System.out.println("ConcreteState1----------handle1");

	}

	@Override
	public void handle2() {
		System.out.println("ConcreteState1----------handle2");
	}

}
