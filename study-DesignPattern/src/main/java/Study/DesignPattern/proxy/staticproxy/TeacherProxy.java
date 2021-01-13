package Study.DesignPattern.proxy.staticproxy;

public class TeacherProxy extends Teacher {

	private Teacher teacher;

	public TeacherProxy(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public void teach() {
		System.out.println("开始代理");
		teacher.teach();
		System.out.println("开始完成");
	}

}
