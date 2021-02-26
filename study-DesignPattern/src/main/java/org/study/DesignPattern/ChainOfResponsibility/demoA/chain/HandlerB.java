package org.study.DesignPattern.ChainOfResponsibility.demoA.chain;

import org.study.DesignPattern.ChainOfResponsibility.demoA.Handler;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class HandlerB extends Handler {

	@Override
	public int handleLevel() {
		return 5;
	}

	@Override
	public Response handle(Request request) {
		if (request.getDays() == this.handleLevel()) {
			return new Response("处理人B处理完成");
		}
		if (nextHandler != null) {
			return nextHandler.handle(request);
		}
		return new Response("error B");
	}

}
