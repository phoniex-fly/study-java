package Study.DesignPattern.Memento.demoA;

/**
 * 备忘录：存储Originator发起人对象的内部状态、供发起人获取对象内部状态
 * 
 * @author user
 *
 */
public class Memento {

	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
