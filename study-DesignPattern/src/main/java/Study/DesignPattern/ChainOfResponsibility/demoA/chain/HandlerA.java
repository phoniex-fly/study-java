package Study.DesignPattern.ChainOfResponsibility.demoA.chain;

import Study.DesignPattern.ChainOfResponsibility.demoA.Handler;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class HandlerA extends Handler {

	@Override
	public int handleLevel() {
		return 3;
	}

	@Override
	public Response handle(Request request) {
		if (request.getDays() == this.handleLevel()) {
			return new Response("处理人A处理完成");
		}
		if (nextHandler != null) {
			return nextHandler.handle(request);
		}
		return new Response("error A");
	}

}
