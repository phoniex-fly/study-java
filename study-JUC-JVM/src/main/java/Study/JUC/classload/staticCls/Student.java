package Study.JUC.classload.staticCls;

/**
 * 从上向下按照顺序进行赋值
 * 
 * @author user
 *
 */
public class Student {

	static int height;
	static int age = 10;

	static {
		age = 20;
	}

	static {
		name = "jack";
	}

	static String name = "rose";

	public static void main(String[] args) {
		System.out.println(height);
		System.out.println(age);
		System.out.println(name);
	}

}
