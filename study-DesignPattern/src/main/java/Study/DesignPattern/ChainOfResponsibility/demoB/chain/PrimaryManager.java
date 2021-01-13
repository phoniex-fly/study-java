package Study.DesignPattern.ChainOfResponsibility.demoB.chain;

import Study.DesignPattern.ChainOfResponsibility.demoB.Manager;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

/**
 * 初级管理者
 * 
 * @author user
 *
 */
public class PrimaryManager extends Manager {

	@Override
	public Response handleRequest(Request request) {
		if ("请假".equals(request.getRequestType()) && request.getDays() <= 2) {
			String msg = request.getName() + "请假时长：" + request.getDays() + "天,被初级管理员批准";
			return new Response(msg);
		} else {
			if (superior != null) {
				return superior.handleRequest(request);
			}
		}
		return new Response("");
	}

}
