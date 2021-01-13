package Study.DesignPattern.Memento.demoC;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {

	List<Memento> baks = new ArrayList<Memento>();

	public void addMemento(Memento memento) {
		baks.add(memento);
	}

	public Memento getMemento(int index) {
		return baks.get(index);
	}
}
