package Study.DesignPattern.adaptor.objAdaptor.pad;

public class Pad {
	
	private Voltage110 voltage;

	public Pad(Voltage110 voltage) {
		this.voltage = voltage;
	}
	
	public void charge() {
		int voltage5v = voltage.getVoltage110V();
		System.out.println("充电"+voltage5v+"伏");
	}

}
