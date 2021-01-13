package Study.DesignPattern.Mediator;

import Study.DesignPattern.Mediator.colleague.Buyer;
import Study.DesignPattern.Mediator.colleague.Seller;
import Study.DesignPattern.Mediator.mediator.Medium;

public class Client {
	public static void main(String[] args) {

		Medium medium = new Medium();
		
		Seller seller = new Seller(medium, "卖家张三");
		Buyer buyer = new Buyer(medium, "买家李四");
		
		seller.sendMsg(buyer.getName(), "买房子咯");
	}

}
