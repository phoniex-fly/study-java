package Study.DesignPattern.Mediator.colleague;

import Study.DesignPattern.Mediator.mediator.Medium;

public class Buyer extends Customer{
	


	public Buyer(Medium medium, String name) {
		super(medium, name);
	}

	@Override
	public void sendMsg(String to,String msg) {
		System.out.println("买方发送消息：" + msg);
		medium.relay(name, to, msg);
	}

	@Override
	public String receiveMsg(String from,String msg) {
		System.out.println("买方接收消息：" + msg);
		return "OK";
	}

}
