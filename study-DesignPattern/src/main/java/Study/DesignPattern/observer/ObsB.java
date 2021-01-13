package Study.DesignPattern.observer;

public class ObsB extends Observer {

	@Override
	public void handle(String str) {
		System.out.println("ObsB收到消息：" + str);
	}

}
