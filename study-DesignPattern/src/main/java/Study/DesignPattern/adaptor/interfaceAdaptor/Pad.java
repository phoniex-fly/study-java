package Study.DesignPattern.adaptor.interfaceAdaptor;

public class Pad {
	
	public void charge() {
		VoltageAdaptor voltageAdaptor = new VoltageAdaptor() {
			@Override
			public int getVoltage110() {
				System.out.println("110");
				return 110;
			}
		};
		voltageAdaptor.getVoltage110();
	}

}
