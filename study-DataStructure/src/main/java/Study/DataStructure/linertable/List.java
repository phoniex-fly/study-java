package Study.DataStructure.linertable;

public interface List<T> {

	void add(T o);

	void add(int i, T o);

	void remove(T o);

	void remove(int i);

	Object get(int i);

	int size();

	boolean isEmpty();

}
