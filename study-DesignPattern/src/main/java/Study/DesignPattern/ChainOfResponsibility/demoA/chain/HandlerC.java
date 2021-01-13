package Study.DesignPattern.ChainOfResponsibility.demoA.chain;

import Study.DesignPattern.ChainOfResponsibility.demoA.Handler;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class HandlerC extends Handler {

	@Override
	public int handleLevel() {
		return 7;
	}

	@Override
	public Response handle(Request request) {
		if (request.getDays() == this.handleLevel()) {
			return new Response("处理人C处理完成");
		}
		return new Response("error C");
	}

}
