package Study.JVM.java8feature.interface8;

public interface Java8Interface {
	
	void sayHi();
	
	default void sayHello() {
		System.out.println("Java8Interface��hello");
	};
	
	static void sayBye() {
		System.out.println("Java8Interface��bye");
	};
	
	static void goodBye() {
		System.out.println("Java8Interface��goodBye");
	};

}
