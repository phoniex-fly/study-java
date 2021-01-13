package Study.DataStructure.linertable.array;

import java.util.Arrays;

import Study.DataStructure.linertable.List;

public class ArrayList implements List {

	private Object[] elementData;

	private static final int DEFAULT_CAPACITY = 2;

	private int size;

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayList(int inialCapacity) {
		this.elementData = new Object[inialCapacity];
		size = 0;
	}

	@Override
	public void add(Object o) {
		// // 扩容
		// if (size == elementData.length) {
		// grow();
		// }
		// elementData[size++] = o;
		this.add(size, o);
	}

	private void grow() {
		// // 创建新数组
		// Object[] newArr = new Object[size * 2];
		// // 旧数组添加至新数组
		// for (int i = 0; i < size; i++) {
		// newArr[i] = elementData[i];
		// }
		// // 位置替换
		// elementData = newArr;
		elementData = Arrays.copyOf(elementData, elementData.length * 2);
	}

	@Override
	public void add(int i, Object o) {
		// 扩容
		if (size == elementData.length) {
			grow();
		}
		for (int j = size; j > i; j--) {
			elementData[j] = elementData[j - 1];
		}
		elementData[i] = o;
	}

	@Override
	public void remove(Object o) {

	}

	@Override
	public void remove(int i) {

	}

	@Override
	public Object get(int i) {
		if (i >= 0 && i < size) {
			return elementData[i];
		}
		throw new RuntimeException("数组越界异常");
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
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i] + ",");
		}
		if (sb.indexOf(",") > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}

}
