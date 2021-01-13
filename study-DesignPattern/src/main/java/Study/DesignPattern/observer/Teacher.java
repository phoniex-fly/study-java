package Study.DesignPattern.observer;

public class Teacher extends ObserverManager{
	
	private String msg;
	

	public Teacher(String msg) {
		this.msg = msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.handle(msg);
		}
	}

}
