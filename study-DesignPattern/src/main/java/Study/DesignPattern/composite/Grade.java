package Study.DesignPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grade extends OrganComponent {

	private List<OrganComponent> klasses;

	public Grade(String name) {
		super(name);
		klasses = new ArrayList<>();
	}

	@Override
	void addChild(OrganComponent organ) {
		klasses.add(organ);
	}

	@Override
	public void removeChild(OrganComponent organ) {
		Iterator<OrganComponent> iterator = klasses.iterator();
		while (iterator.hasNext()) {
			OrganComponent next = iterator.next();
			if (next.getName().equals(organ.getName())) {
				iterator.remove();
			}

		}
	}

	@Override
	public void listChild() {
		System.out.println("-------"+getName());
		for (OrganComponent child : klasses) {
			child.listChild();
		}
	}

}
