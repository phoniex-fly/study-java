package Study.DesignPattern.adaptor.interfaceAdaptor;

public class Phone {
	
	public void charge() {
		VoltageAdaptor voltageAdaptor = new VoltageAdaptor() {
			@Override
			public int getVoltage5() {
				System.out.println("5");
				return 5;
			}
		};
		voltageAdaptor.getVoltage5();
	}

}
