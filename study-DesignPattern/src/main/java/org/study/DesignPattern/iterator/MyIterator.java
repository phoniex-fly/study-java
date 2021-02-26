package org.study.DesignPattern.iterator;

public interface MyIterator<E> {

	boolean hasNext();
	
	E Next();
	
	void remove();
}
