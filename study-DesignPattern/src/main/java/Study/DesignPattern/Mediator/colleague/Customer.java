package Study.DesignPattern.Mediator.colleague;

import Study.DesignPattern.Mediator.mediator.Medium;

public abstract class Customer {

	protected Medium medium;

	protected String name;

	public Customer(Medium medium,String name) {
		this.medium = medium;
		this.name = name;
		medium.register(this);
	}
	
	

	public String getName() {
		return name;
	}

	public abstract void sendMsg(String to, String msg);

	public abstract String receiveMsg(String from, String msg);

}
