package Study.JUC.classload.nonStaticCls;

public class Teacher {

	int age = 10;

	{
		age = 15;
	}

	public Teacher() {
	}

	public Teacher(int age) {
		this.age = age;
	}

}

class Test {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
	}
}
