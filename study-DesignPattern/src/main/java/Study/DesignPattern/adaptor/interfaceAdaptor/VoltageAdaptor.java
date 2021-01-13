package Study.DesignPattern.adaptor.interfaceAdaptor;

public abstract class VoltageAdaptor implements Voltage220{

	@Override
	public int getVoltage5() {
		return 0;
	}

	@Override
	public int getVoltage10() {
		return 0;
	}

	@Override
	public int getVoltage36() {
		return 0;
	}

	@Override
	public int getVoltage110() {
		return 0;
	}

}
