package Study.DesignPattern.State.demoB;

import Study.DesignPattern.State.demoB.state.CloseState;

public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.setCurrentState(new CloseState());
		context.open();
		context.close();
		context.running();
		context.stop();
	}

}
