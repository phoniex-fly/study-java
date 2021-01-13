package Study.DesignPattern.Memento.demoA;

public class Test {

	public static void main(String[] args) {
		Originator originator = new Originator("任务开始");
		System.out.println("任务初始状态----------" + originator.getState());

		// 保存备忘录
		Memento memento = originator.createMemento();
		Caretaker taker = new Caretaker();
		taker.setMemento(memento);

		originator.setState("任务进行中");
		System.out.println("任务修改状态----------" + originator.getState());

		// 获取备忘录
		Memento mementoo = originator.getMemento(taker);
		System.out.println("任务备忘----------" + mementoo.getState());
		System.out.println("任务当前状态----------" + originator.getState());

		// 恢复备忘录
		originator.setMemento(taker);
		System.out.println("任务恢复备忘----------" + originator.getState());
	}

}
