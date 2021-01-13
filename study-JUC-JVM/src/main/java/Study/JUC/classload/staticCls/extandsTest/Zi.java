package Study.JUC.classload.staticCls.extandsTest;

/**
 * 加载子类前先加载父类
 * 
 * @author user
 *
 */
public class Zi extends Fu {

	static int a = getNum2();

	static {
		System.out.println("3");
	}

	private static int getNum2() {
		System.out.println("4");
		return 20;
	}

	public static void main(String[] args) {

	}

}
