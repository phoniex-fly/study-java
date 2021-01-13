package Study.DesignPattern.State.demoB;

import Study.DesignPattern.State.demoB.state.CloseState;
import Study.DesignPattern.State.demoB.state.OpenState;
import Study.DesignPattern.State.demoB.state.RunningState;
import Study.DesignPattern.State.demoB.state.StopState;

public class Context {

	/**
	 * 定义环境所有状态
	 */
	public static final LiftState OPEN = new OpenState();
	public static final LiftState RUNNING = new RunningState();
	public static final LiftState CLOSE = new CloseState();
	public static final LiftState STOP = new StopState();

	/**
	 * 定义当前状态
	 * 
	 */
	private LiftState currentState;

	public LiftState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(LiftState currentState) {
		this.currentState = currentState;
		// 通知到各个实现类中
		this.currentState.setContext(this);
	}

	/**
	 * 各状态执行的操作
	 */
	public void open() {
		this.currentState.open();
	};

	public void running() {
		this.currentState.running();
	};

	public void close() {
		this.currentState.close();
	};

	public void stop() {
		this.currentState.stop();
	};

}
