package Study.JUC.classload.staticCls.extandsTest;

public class Fu {
	static int a = getNum1();

	static {
		System.out.println("1");
	}

	private static int getNum1() {
		System.out.println("2");
		return 10;
	}

}
