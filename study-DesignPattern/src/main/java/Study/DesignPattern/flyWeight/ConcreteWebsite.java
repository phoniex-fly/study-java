package Study.DesignPattern.flyWeight;

public class ConcreteWebsite implements WebSite {

	private String type;
	

	public ConcreteWebsite(String type) {
		this.type = type;
	}

	@Override
	public void run(User user) {
		System.out.println(type + "类型网站在运行,运营者为"+user.getName());
	}

}
