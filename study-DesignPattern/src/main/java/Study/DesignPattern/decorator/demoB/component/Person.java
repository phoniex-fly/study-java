package Study.DesignPattern.decorator.demoB.component;

public class Person {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void decorate() {
		System.out.println("被装饰者：" + name);
	}
}
