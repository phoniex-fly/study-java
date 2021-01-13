package Study.DesignPattern.adaptor.objAdaptor;

import Study.DesignPattern.adaptor.objAdaptor.pad.Voltage110;
import Study.DesignPattern.adaptor.objAdaptor.phone.Voltage5;

public class VoltageAdaptor implements Voltage5,Voltage110{
	
	private Voltage220 voltage220;
	

	public VoltageAdaptor(Voltage220 voltage220) {
		super();
		this.voltage220 = voltage220;
	}



	@Override
	public int getVoltage5V() {
		int vol220 = voltage220.getVoltage220();
		return vol220/44;
	}



	@Override
	public int getVoltage110V() {
		int vol220 = voltage220.getVoltage220();
		return vol220/2;
	}

}
