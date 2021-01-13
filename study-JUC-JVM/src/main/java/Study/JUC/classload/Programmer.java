package Study.JUC.classload;

/**
 * 类加载过程： 先初始化 后实例化
 * 
 * 2---静态方法
 * 
 * 1---静态代码块
 * 
 * 5---实例方法
 * 
 * 4---实例代码块
 * 
 * 3---构造方法
 ************
 * 5---实例方法
 * 
 * 4---实例代码块
 * 
 * 3---构造方法
 ************
 * main
 * 
 * @author user
 *
 */
public class Programmer {

	public static int salary = getSalary();

	private int workage = getWorkAge();

	public Programmer() {
		System.out.println("3---构造方法");
	}

	{
		System.out.println("4---实例代码块");
	}

	private int getWorkAge() {
		System.out.println("5---实例方法");
		return 12;
	}

	static {
		System.out.println("1---静态代码块");
	}

	private static int getSalary() {
		System.out.println("2---静态方法");
		return 2000;
	}

	public static void main(String[] args) {
		new Programmer();
		System.out.println("************");
		new Programmer();
		System.out.println("************");
		System.out.println("main");
	}

}
