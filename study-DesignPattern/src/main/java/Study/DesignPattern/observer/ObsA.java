package Study.DesignPattern.observer;

public class ObsA extends Observer {

	@Override
	public void handle(String str) {
		System.out.println("ObsA收到消息：" + str);
	}

}
