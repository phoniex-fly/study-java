package Study.DesignPattern.ChainOfResponsibility.demoB.dto;

public class Request {

	private String name;// 请假人
	private String requestType; // 申请类别
	private String requestContent; // 申请内容
	private int days; // 请假天数

	public Request(String name, String requestType, String requestContent, int days) {
		super();
		this.name = name;
		this.requestType = requestType;
		this.requestContent = requestContent;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
