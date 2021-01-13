package Study.DesignPattern.adaptor.classAdaptor;

public class VoltageAdaptor extends Voltage220 implements Voltage5{

	@Override
	public int getVoltage5V() {
		int voltage220 = this.getVoltage220();
		return voltage220/44;
	}

}
