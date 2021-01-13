package Study.DesignPattern.bridge.phone;

public class FoldedPhone implements Phone{

	private String desc = "折叠手机";

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
