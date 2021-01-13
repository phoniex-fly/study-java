package Study.DataStructure.linertable.linked;

public class Node<T> {

	T data;
	Node<T> next;

	public Node() {
		super();
	}

	public Node(T data) {
		super();
		this.data = data;
	}

	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
