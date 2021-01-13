package Study.DesignPattern.Memento.demoB;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<ContactPerson> contactPersons = new ArrayList<ContactPerson>();

		ContactPerson person1 = new ContactPerson("张三", "111111");
		ContactPerson person2 = new ContactPerson("张四", "222222");
		ContactPerson person3 = new ContactPerson("张五", "333333");
		contactPersons.add(person1);
		contactPersons.add(person2);
		contactPersons.add(person3);
		// 三个联系人
		System.out.println("原始联系人" + contactPersons.toString());

		MobileBackOriginator originator = new MobileBackOriginator(contactPersons);

		// 创建备份
		ContactPersonMemento memento = originator.createMemento();
		ContactPersonMementoManager manager = new ContactPersonMementoManager();
		manager.setMemento(memento);
		System.out.println("备份联系人" + memento.toString());

		ContactPerson person4 = new ContactPerson("张六", "444444");
		contactPersons.add(person4);
		System.out.println("修改联系人" + contactPersons.toString());

		// 获取备份
		List<ContactPerson> contactPersonsBack = originator.getMemento(manager);
		System.out.println("备份联系人" + contactPersonsBack.toString());
	}

}
