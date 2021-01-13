package Study.DesignPattern.observer;

public class Test {

	public static void main(String[] args) {
		ObserverManager teacher = new Teacher("ÄãºÃ");
		teacher.add(new ObsA());
		teacher.add(new ObsB());
		teacher.add(new ObsC());
		
		teacher.notifyObservers();
	}
}
