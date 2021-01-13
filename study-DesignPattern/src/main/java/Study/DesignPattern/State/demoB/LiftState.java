package Study.DesignPattern.State.demoB;

public abstract class LiftState {

	protected Context context;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void open();

	public abstract void running();

	public abstract void close();

	public abstract void stop();
}
