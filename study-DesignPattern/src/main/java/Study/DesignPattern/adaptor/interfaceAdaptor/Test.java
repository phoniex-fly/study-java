package Study.DesignPattern.adaptor.interfaceAdaptor;

public class Test {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charge();
		
		Pad pad = new Pad();
		pad.charge();
	}
}
