package Study.DesignPattern.State.demoB.state;

import Study.DesignPattern.State.demoB.Context;
import Study.DesignPattern.State.demoB.LiftState;

public class StopState extends LiftState {
	// 停下了要开门
	@Override
	public void open() {
		// 状态改变
		super.context.setCurrentState(Context.OPEN);
		super.context.getCurrentState().open();
	}

	// 停止后可以再运行
	@Override
	public void running() {
		// 状态改变
		super.context.setCurrentState(Context.RUNNING);
		super.context.getCurrentState().running();
	}

	// 门本来就是关着的
	@Override
	public void close() {
		// 什么都不做
	}

	// 执行停止方法
	@Override
	public void stop() {
		System.out.println("电梯停止了");
	}

}
