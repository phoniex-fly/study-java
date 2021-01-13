package Study.DesignPattern.Memento.demoC;

public class Originator {

	private int id;

	private String state;

	public Originator(int id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 备份当前状态
	 */
	public Memento bak() {
		return new Memento(state);
	}

	/**
	 * 恢复状态
	 * 
	 * @param memento
	 */
	public void rollback(Memento memento) {
		state = memento.getState();
	}

	@Override
	public String toString() {
		return "Originator [id=" + id + ", state=" + state + "]";
	}

}
