package Study.DesignPattern.Template;

public class Test {
	public static void main(String[] args) {
		HealthCheck normalPeopleCheck = new NormalPeopleCheck();
		normalPeopleCheck.HealthCheck();
		System.out.println("==============================");
		HealthCheck specialPeopleCheck = new SpecialPeopleCheck();
		specialPeopleCheck.HealthCheck();
	}

}
