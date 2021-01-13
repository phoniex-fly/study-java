package Study.DesignPattern.State.demoB.state;

import Study.DesignPattern.State.demoB.Context;
import Study.DesignPattern.State.demoB.LiftState;

public class OpenState extends LiftState {
	// 执行打开电梯门方法
	@Override
	public void open() {
		System.out.println("电梯门开启");
	}

	// 门开着不能运行
	@Override
	public void running() {

	}

	// 打开后还可以关闭电梯门
	@Override
	public void close() {
		// 状态改变
		super.context.setCurrentState(Context.CLOSE);
		super.context.getCurrentState().close();
	}

	// 门开着已经停止了
	@Override
	public void stop() {

	}

}
