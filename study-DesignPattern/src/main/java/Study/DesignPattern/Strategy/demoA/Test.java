package Study.DesignPattern.Strategy.demoA;

import Study.DesignPattern.Strategy.demoA.strategy.StrategyA;
import Study.DesignPattern.Strategy.demoA.strategy.StrategyB;
import Study.DesignPattern.Strategy.demoA.strategy.StrategyC;

public class Test {
	public static void main(String[] args) {
		Context context;

		context = new Context(new StrategyA());
		context.context();

		context = new Context(new StrategyB());
		context.context();

		context = new Context(new StrategyC());
		context.context();
	}

}
