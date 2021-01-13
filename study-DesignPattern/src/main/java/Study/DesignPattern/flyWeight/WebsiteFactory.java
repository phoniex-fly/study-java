package Study.DesignPattern.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

	private Map<String, WebSite> map = new HashMap<>();

	public WebSite getWebsite(String type) {
		WebSite webSite = new ConcreteWebsite(type);
		map.put(type, webSite);
		return webSite;
	}
	
	public void getSize() {
		System.out.println(map.size());
	}

}
