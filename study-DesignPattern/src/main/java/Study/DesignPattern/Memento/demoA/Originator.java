package Study.DesignPattern.Memento.demoA;

/**
 * 备份发起人：创建备份、获取备份、恢复备份
 * 
 * @author user
 *
 */
public class Originator {

	private String state;

	public Originator(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建备忘录
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 获取备忘录
	 * 
	 * @param taker
	 * @return
	 */
	public Memento getMemento(Caretaker taker) {
		return taker.getMemento();
	}

	/**
	 * 恢复至备忘录
	 * 
	 * @param taker
	 */
	public void setMemento(Caretaker taker) {
		state = taker.getMemento().getState();
	}

}
