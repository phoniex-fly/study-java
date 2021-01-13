package Study.DesignPattern.bridge.brand;

import Study.DesignPattern.bridge.phone.Phone;

public class Apple extends Brand{

	public Apple(Phone phone) {
		super(phone);
	}
	
	public void open() {
		System.out.println("Apple");
		super.open();
	}

	public void close() {
		System.out.println("Apple");
		super.close();
	}

	public void call() {
		System.out.println("Apple");
		super.call();

	}

}
