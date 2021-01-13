package Study.DesignPattern.Memento.demoA;

/**
 * 备忘录管理者：获取备忘录
 * 
 * @author user
 *
 */
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
