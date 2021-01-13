package Study.DesignPattern.Strategy.demoA;

public class Context {

	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void context() {
		strategy.algorithm();
	}

}
