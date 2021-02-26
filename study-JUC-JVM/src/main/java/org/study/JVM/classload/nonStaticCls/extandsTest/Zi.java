package org.study.JVM.classload.nonStaticCls.extandsTest;

/**
 * 子类构造方法执行之前先调用父类构造方法
 * 
 * 实例变量赋值和实例代码块按照顺序进行初始化
 * 
 * @author user
 *
 */
public class Zi extends Fu {

	{
		b = 3;
		System.out.println("子类实例代码块");
	}

	int a = 1;
	int b = 2;

	public Zi() {

		System.out.println("a子类无参构造器--" + b);
	}

	public Zi(int a, int b) {
		System.out.println("aa子类有参构造器");
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Zi zi = new Zi();
	}

}
