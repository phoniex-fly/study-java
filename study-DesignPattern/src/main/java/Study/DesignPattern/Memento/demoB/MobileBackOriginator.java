package Study.DesignPattern.Memento.demoB;

import java.util.List;

/**
 * 备份发起人
 * 
 * @author user
 *
 */
public class MobileBackOriginator {

	private List<ContactPerson> contactPersons;

	public MobileBackOriginator(List<ContactPerson> contactPersons) {
		super();
		this.contactPersons = contactPersons;
	}

	public List<ContactPerson> getContactPersons() {
		return contactPersons;
	}

	/**
	 * 创建备份
	 * 
	 * @return
	 */
	public ContactPersonMemento createMemento() {
		return new ContactPersonMemento(contactPersons);
	}

	/**
	 * 获取备份
	 * 
	 * @param manager
	 * @return
	 */
	public List<ContactPerson> getMemento(ContactPersonMementoManager manager) {
		return manager.getMemento().getContactPersonsback();
	}

}
