package Study.DesignPattern.Template;

public class NormalPeopleCheck extends HealthCheck{

	@Override
	public void virus() {
		System.out.println("一般人群不检测核酸");
		
	}

}
