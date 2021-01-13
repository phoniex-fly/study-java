package Study.DesignPattern.visitor;

import Study.DesignPattern.visitor.action.Fail;
import Study.DesignPattern.visitor.action.Success;
import Study.DesignPattern.visitor.element.Man;
import Study.DesignPattern.visitor.element.Woman;

public class Client {
	public static void main(String[] args) {
		ObjectConstructure oc = new ObjectConstructure();
		
		oc.attach(new Man());
		oc.attach(new Woman());
		
		oc.display(new Success());
		System.out.println("==================");
		oc.display(new Fail());
	}

}
