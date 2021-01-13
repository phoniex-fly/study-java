package Study.DesignPattern.iterator;

public class Test {
	public static void main(String[] args) {
		Candle candle = new Candle();
		MyIterator iterator = candle.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.Next());
		}
	}

}
