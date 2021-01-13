package Study.DesignPattern.ChainOfResponsibility.demoB;

import Study.DesignPattern.ChainOfResponsibility.demoB.chain.IntermediateManager;
import Study.DesignPattern.ChainOfResponsibility.demoB.chain.PrimaryManager;
import Study.DesignPattern.ChainOfResponsibility.demoB.chain.SeniorManager;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class Test {
	public static void main(String[] args) {

		PrimaryManager pm = new PrimaryManager();
		IntermediateManager im = new IntermediateManager();
		SeniorManager sm = new SeniorManager();
		pm.setSuperior(im);
		im.setSuperior(sm);

		Request request1 = new Request("张三", "请假", "病假", 1);
		Request request2 = new Request("李四", "请假", "事假", 4);
		Request request3 = new Request("王五", "请假", "婚假", 8);

		Response response1 = pm.handleRequest(request1);
		System.out.println(response1.getMsg());
		Response response2 = pm.handleRequest(request2);
		System.out.println(response2.getMsg());
		Response response3 = pm.handleRequest(request3);
		System.out.println(response3.getMsg());
	}

}
