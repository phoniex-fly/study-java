package Study.DesignPattern.flyWeight;

public class Client {
	
	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		WebSite website = factory.getWebsite("博客");
		website.run(new User("张三"));
		
		WebSite website2 = factory.getWebsite("公众号");
		website2.run(new User("张四"));
		
		WebSite website3 = factory.getWebsite("网页");
		website3.run(new User("张五"));
		WebSite website4 = factory.getWebsite("网页");
		website4.run(new User("张6"));
		WebSite website5 = factory.getWebsite("网页");
		website5.run(new User("张7"));
		
		factory.getSize();
	}

}
