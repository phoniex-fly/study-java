package Study.DataStructure.linertable.linked;

import Study.DataStructure.linertable.List;

public class SingleLinkedList<T> implements List<T> {

	private Node<T> head = new Node<>();// 头节点，不存储数据

	private int size;

	@Override
	public void add(T o) {
		this.add(size, o);
	}

	@Override
	public void add(int i, T o) {
		// 新创建一个节点
		Node<T> newNode = new Node<T>(o);
		// 找到i-1节点
		Node<T> prev = head;
		for (int j = 0; j < i; j++) {
			prev = prev.next;
		}
		// 将newNode的next指向i节点
		newNode.next = prev.next;
		// 将i-1节点的next指向newNode
		prev.next = newNode;
		// 节点数量增加
		size++;
	}

	@Override
	public void remove(T o) {

	}

	@Override
	public void remove(int i) {

	}

	@Override
	public Object get(int i) {
		if (i > size || i < 0) {
			throw new RuntimeException("数组越界异常");
		}
		Node<T> prev = head;
		for (int j = 0; j <= i; j++) {
			prev = prev.next;
		}
		return prev.getData();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			sb.append(node.next.data + ",");
			node = node.next;
		}
		if (sb.indexOf(",") > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}

}
