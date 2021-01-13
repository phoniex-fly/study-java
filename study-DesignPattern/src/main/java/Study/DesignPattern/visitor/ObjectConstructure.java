package Study.DesignPattern.visitor;

import java.util.ArrayList;
import java.util.List;

import Study.DesignPattern.visitor.action.Action;
import Study.DesignPattern.visitor.element.Person;

public class ObjectConstructure {
	
	public List<Person> persons = new ArrayList<Person>();
	
	public void attach(Person person) {
		persons.add(person);
	}
	
	public void remove(Person person) {
		persons.remove(person);
	}
	
	public void display(Action action) {
		for(Person person : persons) {
			person.accept(action);
		}
	}

}
