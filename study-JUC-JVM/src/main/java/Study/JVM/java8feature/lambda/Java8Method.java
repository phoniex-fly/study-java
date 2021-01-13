package Study.JVM.java8feature.lambda;

import java.util.Arrays;
import java.util.List;

public class Java8Method {

	public static Java8Method create(final Supplier<Java8Method> sup) {
		return sup.get();
	}

	public static void collide(final Java8Method med) {
		System.out.println("collide---" + med.toString());
	}

	public void follow(final Java8Method med) {
		System.out.println("follow---" + med.toString());
	}

	public void repair() {
		System.out.println("repair---" + this.toString());
	}
	



	public static void main(String[] args) {
		Java8Method create = Java8Method.create(Java8Method::new);
		Java8Method create2 = Java8Method.create(Java8Method::new);
		Java8Method create3 = Java8Method.create(Java8Method::new);

		List<Java8Method> list = Arrays.asList(create, create2, create3);
		list.forEach(Java8Method::collide);
		list.forEach(Java8Method::repair);
	}

}

@FunctionalInterface
interface Supplier<T> {
	T get();
}
