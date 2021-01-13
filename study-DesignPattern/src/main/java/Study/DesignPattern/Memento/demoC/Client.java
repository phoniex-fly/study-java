package Study.DesignPattern.Memento.demoC;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator(1, "״̬1");
		System.out.println(originator);

		MementoManager manager = new MementoManager();
		manager.addMemento(originator.bak());

		originator.setState("״̬2");
		System.out.println(originator);

		originator.rollback(manager.getMemento(0));
		System.out.println(originator);
	}

}
