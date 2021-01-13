package Study.DesignPattern.bridge;

import Study.DesignPattern.bridge.brand.Apple;
import Study.DesignPattern.bridge.brand.Brand;
import Study.DesignPattern.bridge.brand.Vivo;
import Study.DesignPattern.bridge.phone.FoldedPhone;
import Study.DesignPattern.bridge.phone.UprightPhone;

public class Test {

	public static void main(String[] args) {
		Brand phone = new Vivo(new FoldedPhone());
		
		phone.open();
		phone.close();
		phone.call();
		
		System.out.println("=================");
		
		Brand phone1 = new Apple(new UprightPhone());
		
		phone1.open();
		phone1.close();
		phone1.call();
	}
}
