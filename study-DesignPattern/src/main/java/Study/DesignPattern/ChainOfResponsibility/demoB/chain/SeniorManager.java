package Study.DesignPattern.ChainOfResponsibility.demoB.chain;

import Study.DesignPattern.ChainOfResponsibility.demoB.Manager;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

/**
 * 高级管理者
 * 
 * @author user
 *
 */
public class SeniorManager extends Manager {

	@Override
	public Response handleRequest(Request request) {
		if ("请假".equals(request.getRequestType())) {
			String msg = request.getName() + "请假时长：" + request.getDays() + "天,被高级管理员批准";
			return new Response(msg);
		}
		return new Response("");
	}

}
