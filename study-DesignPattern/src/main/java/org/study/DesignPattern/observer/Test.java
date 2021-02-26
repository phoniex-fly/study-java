package org.study.DesignPattern.observer;

public class Test {

	public static void main(String[] args) {
		ObserverManager teacher = new Teacher("���");
		teacher.add(new ObsA());
		teacher.add(new ObsB());
		teacher.add(new ObsC());
		
		teacher.notifyObservers();
	}
}
