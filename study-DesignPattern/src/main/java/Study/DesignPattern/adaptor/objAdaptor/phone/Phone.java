package Study.DesignPattern.adaptor.objAdaptor.phone;

public class Phone {
	
	private Voltage5 voltage;

	public Phone(Voltage5 voltage) {
		this.voltage = voltage;
	}
	
	public void charge() {
		int voltage5v = voltage.getVoltage5V();
		System.out.println("充电"+voltage5v+"伏");
	}

}
