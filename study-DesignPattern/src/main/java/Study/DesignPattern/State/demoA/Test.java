package Study.DesignPattern.State.demoA;

import Study.DesignPattern.State.demoA.state.ConcreteState1;

public class Test {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurrentState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}

}
