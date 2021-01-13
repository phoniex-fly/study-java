package Study.DesignPattern.adaptor.classAdaptor;

public class Test {
	public static void main(String[] args) {
		Phone phone = new Phone(new VoltageAdaptor());
		phone.charge();
	}

}
