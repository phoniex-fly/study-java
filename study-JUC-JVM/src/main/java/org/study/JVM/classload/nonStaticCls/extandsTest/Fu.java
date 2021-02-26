package org.study.JVM.classload.nonStaticCls.extandsTest;

public class Fu {
	int a = 4;
	int b = 5;

	{
		b = 6;
		System.out.println("父类实例代码块");
	}

	public Fu() {
		System.out.println("b父类无参构造器" + b);
	}

	public Fu(int a, int b) {
		System.out.println("bb父类有参构造器");
		this.a = a;
		this.b = b;
	}

}
