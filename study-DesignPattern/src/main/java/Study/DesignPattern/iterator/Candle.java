package Study.DesignPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Candle implements Bagpack {

	List<String> candles = new ArrayList<String>();

	public Candle() {
		candles.add("巧克力糖");
		candles.add("薄荷糖");
		candles.add("苹果糖");
		candles.add("橙子糖");
		candles.add("彩虹糖");
	}

	@Override
	public MyIterator getIterator() {
		return new CandelIterator();
	}

	private class CandelIterator implements MyIterator<String> {
		private int index = -1;

		@Override
		public boolean hasNext() {
			if (index >= candles.size() - 1) {
				return false;
			}
			index = index + 1;
			return true;
		}

		@Override
		public String Next() {
			return candles.get(index);
		}

		@Override
		public void remove() {
			candles.remove(index);
		}

	}

}
