package Study.DesignPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University extends OrganComponent{
	
	private List<OrganComponent> grades;

	public University(String name) {
		super(name);
		grades = new ArrayList<>();
	}

	@Override
	void addChild(OrganComponent organ) {
		grades.add(organ);
	}

	@Override
	public void removeChild(OrganComponent organ) {
		Iterator<OrganComponent> iterator = grades.iterator();
		while (iterator.hasNext()) {
			OrganComponent next = iterator.next();
			if (next.getName().equals(organ.getName())) {
				iterator.remove();
			}

		}
	}

	@Override
	public void listChild() {
		System.out.println("---"+getName());
		for (OrganComponent child : grades) {
			child.listChild();
		}
	}
	
	

}
