package Study.DesignPattern.Mediator.mediator;

import java.util.HashMap;
import java.util.Map;

import Study.DesignPattern.Mediator.colleague.Customer;

public class Medium {

	private Map<String,Customer> customers = new HashMap<>();

	public void register(Customer customer) {
		customers.put(customer.getName(), customer);
	};

	public void relay(String from,String to,String msg) {
		Customer buyer = customers.get(to);
		String buyerSend = buyer.receiveMsg(from, msg);
		if(buyerSend.equals("OK")) {
			buyer.sendMsg(from, buyerSend);
		}
	};

}
