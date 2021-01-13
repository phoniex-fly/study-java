package Study.DesignPattern.bridge.brand;

import Study.DesignPattern.bridge.phone.Phone;

public class Vivo extends Brand {
	

	public Vivo(Phone phone) {
		super(phone);
	}
	
	public void open() {
		System.out.println("Vivo");
		super.open();
	}

	public void close() {
		System.out.println("Vivo");
		super.close();
	}

	public void call() {
		System.out.println("Vivo");
		super.call();

	}

}
