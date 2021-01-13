package Study.DesignPattern.adaptor.objAdaptor;

import Study.DesignPattern.adaptor.objAdaptor.pad.Pad;
import Study.DesignPattern.adaptor.objAdaptor.phone.Phone;

public class Test {
	public static void main(String[] args) {
		Phone phone = new Phone(new VoltageAdaptor(new Voltage220()));
		phone.charge();
		
		Pad pad = new Pad(new VoltageAdaptor(new Voltage220()));
		pad.charge();
	}

}
