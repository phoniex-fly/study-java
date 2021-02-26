package org.study.JVM.java8feature.lambda;

public class Java8Lambda {
	
	public static final String str = "Lili";
	
	public static void main(String[] args) {
//		Java8Lambda test = new Java8Lambda();

		MathOperation operation = (int a, int b) -> a + b;

		MathOperation oper = (a, b) -> a * b;

		MathOperation op = (a, b) -> {
			return a - b;
		};
		Msg msg = name -> System.out.println("hi," + name);
		msg.sayHi(str);
	}

	@FunctionalInterface
	interface MathOperation {
		int operation(int a, int b);
	}

	@FunctionalInterface
	interface Msg {
		void sayHi(String name);
	}
}
