package Study.DesignPattern.State.demoA;

import Study.DesignPattern.State.demoA.state.ConcreteState1;
import Study.DesignPattern.State.demoA.state.ConcreteState2;

/**
 * 环境角色具有两个职责， 处理本状态必须完成的任务， 决定是否可以过渡到其它状态。
 * 
 * 
 * 即把状态对象声明为静态常量，有几个状态对象就声明几个状态常量 环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式
 * 
 * @author user
 *
 */
public class Context {

	/**
	 * 定义状态
	 */
	public static final State STATE1 = new ConcreteState1();
	public static final State STATE2 = new ConcreteState2();

	private State currentState;

	/**
	 * 获取状态
	 * 
	 * @return
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * 设置状态
	 * 
	 * @param currentState
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		// 切换状态
		this.currentState.setContext(this);
	}

	public void handle1() {
		this.currentState.handle1();
	}

	public void handle2() {
		this.currentState.handle2();
	}

}
