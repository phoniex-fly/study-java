package Study.DesignPattern.bridge.phone;

public class UprightPhone implements Phone {

	private String desc = "直立手机";

	@Override
	public void open() {
		System.out.println(desc + "打开");
	}

	@Override
	public void close() {
		System.out.println(desc + "关闭");

	}

	@Override
	public void call() {
		System.out.println(desc + "打电话");

	}

}
