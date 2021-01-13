package Study.DesignPattern.ChainOfResponsibility.demoA;

import Study.DesignPattern.ChainOfResponsibility.demoA.chain.HandlerA;
import Study.DesignPattern.ChainOfResponsibility.demoA.chain.HandlerB;
import Study.DesignPattern.ChainOfResponsibility.demoA.chain.HandlerC;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class Test {

	public static void main(String[] args) {
		HandlerA A = new HandlerA();
		HandlerB B = new HandlerB();
		HandlerC C = new HandlerC();

		A.setNext(B);
		B.setNext(C);

		Request request1 = new Request("张三", "请假", "病假", 3);
		Request request2 = new Request("李四", "请假", "事假", 5);
		Request request3 = new Request("王五", "请假", "婚假", 7);

		Response response1 = A.handle(request1);
		Response response2 = A.handle(request2);
		Response response3 = A.handle(request3);

		System.out.println(response1.getMsg());
		System.out.println(response2.getMsg());
		System.out.println(response3.getMsg());
	}

}
