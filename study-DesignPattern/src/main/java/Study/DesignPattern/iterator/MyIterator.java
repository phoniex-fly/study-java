package Study.DesignPattern.iterator;

public interface MyIterator<E> {

	boolean hasNext();
	
	E Next();
	
	void remove();
}
