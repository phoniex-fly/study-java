package Study.DesignPattern.ChainOfResponsibility.demoA;

import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import Study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public abstract class Handler {

	protected Handler nextHandler;// 下一个处理者

	/**
	 * 设定下一个处理者
	 * 
	 * @param nextHandler
	 */
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * 当前处理人可处理的事件等级
	 * 
	 * @return
	 */
	public abstract int handleLevel();

	/**
	 * 当前处理人具体出处理步骤
	 * 
	 * @param request
	 * @return
	 */
	public abstract Response handle(Request request);

}
