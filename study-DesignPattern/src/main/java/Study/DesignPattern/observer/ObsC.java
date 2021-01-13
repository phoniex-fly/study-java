package Study.DesignPattern.observer;

public class ObsC extends Observer {

	@Override
	public void handle(String str) {
		System.out.println("ObsC收到消息：" + str);
	}

}
