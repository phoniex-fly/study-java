package Study.DesignPattern.State.demoB.state;

import Study.DesignPattern.State.demoB.Context;
import Study.DesignPattern.State.demoB.LiftState;

public class CloseState extends LiftState {
	// 电梯门关了可以再开
	@Override
	public void open() {
		// 置为敞门状态
		super.context.setCurrentState(Context.OPEN);
		super.context.getCurrentState().open();
	}

	// 电梯门关了就运行
	@Override
	public void running() {
		super.context.setCurrentState(Context.RUNNING);
		super.context.getCurrentState().running();
	}

	// 执行电梯门关闭方法
	@Override
	public void close() {
		System.out.println("电梯门关闭");
	}

	// 电梯门关了但没有按楼层
	@Override
	public void stop() {
		super.context.setCurrentState(Context.STOP);
		super.context.getCurrentState().stop();
	}

}
