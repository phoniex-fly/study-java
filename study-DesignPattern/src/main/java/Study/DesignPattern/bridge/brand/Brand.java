package Study.DesignPattern.bridge.brand;

import Study.DesignPattern.bridge.phone.Phone;

public abstract class Brand {
	
	private Phone phone;

	public Brand(Phone phone) {
		this.phone = phone;
	}
	
	public void open() {
		phone.open();
	}

	public void close() {
		phone.close();
	}

	public void call() {
		phone.call();

	}
	
	

}
