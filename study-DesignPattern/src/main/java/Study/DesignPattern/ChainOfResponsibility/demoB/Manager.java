package Study.DesignPattern.ChainOfResponsibility.demoB;

import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public abstract class Manager {

	protected Manager superior;// 管理者的上级

	/**
	 * 设定下一个审批人
	 * 
	 * @param superior
	 */
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	/**
	 * 处理请求
	 * 
	 * @param request
	 */
	public abstract Response handleRequest(Request request);
}
