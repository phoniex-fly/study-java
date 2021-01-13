package Study.DesignPattern.Memento.demoB;

import java.util.List;

public class ContactPersonMemento {

	private List<ContactPerson> contactPersonsback;

	public ContactPersonMemento(List<ContactPerson> contactPersons) {
		this.contactPersonsback = contactPersons;
	}

	public List<ContactPerson> getContactPersonsback() {
		return contactPersonsback;
	}

	@Override
	public String toString() {
		return "ContactPersonMemento [contactPersonsback=" + contactPersonsback + "]";
	}

}
