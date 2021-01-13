package Study.DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ObserverManager {
	
	public List<Observer> observers = new ArrayList<Observer>();
	
	
	public final void add(Observer observer) {
		observers.add(observer);
	}
	
	public final void move(Observer observer) {
		observers.remove(observer);
	}
	
	public abstract void notifyObservers();

}
