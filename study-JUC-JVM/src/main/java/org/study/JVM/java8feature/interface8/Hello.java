package org.study.JVM.java8feature.interface8;

public class Hello implements Java8Interface{

	@Override
	public void sayHi() {
		System.out.println("Hello:Hi");
	}

	public void test() {
		sayBye();
//		Java8Interface.super.sayHi();
	}
}
