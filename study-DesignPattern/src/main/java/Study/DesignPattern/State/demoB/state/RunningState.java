package Study.DesignPattern.State.demoB.state;

import Study.DesignPattern.State.demoB.Context;
import Study.DesignPattern.State.demoB.LiftState;

public class RunningState extends LiftState {
	// 运行时不能开门
	@Override
	public void open() {
		// 什么都不做
	}

	// 执行运行方法
	@Override
	public void running() {
		System.out.println("电梯运行中");
	}

	// 运行时门肯定是关的
	@Override
	public void close() {
		// 什么都不做
	}

	// 运行后可以停止
	@Override
	public void stop() {
		// 状态改变
		super.context.setCurrentState(Context.STOP);
		super.context.getCurrentState().stop();
	}

}
