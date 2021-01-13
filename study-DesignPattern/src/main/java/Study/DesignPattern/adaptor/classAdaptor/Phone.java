package Study.DesignPattern.adaptor.classAdaptor;

public class Phone {
	
	private VoltageAdaptor adaptor;

	public Phone(VoltageAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	
	public void charge() {
		int voltage5v = adaptor.getVoltage5V();
		System.out.println("充电"+voltage5v+"伏");
	}

}
