package Study.Algorithm.sort;

public abstract class Sort {

	public int[] array;
	public int compareCount;// 比较次数
	public int swapCount;// 交换次数

	public void sort(int[] array) {
		if (array == null | array.length < 2) {
			return;
		}
		this.array = array;
		concreteSort();
	}

	public abstract void concreteSort();

	/**
	 * 比较两数大小
	 * 
	 * @param idx1
	 * @param idx2
	 * @return
	 */
	public int compareByIdx(int idx1, int idx2) {
		compareCount++;
		return array[idx1] - array[idx2];
	}

	/**
	 * 比较两数大小
	 * 
	 * @param idx1
	 * @param idx2
	 * @return
	 */
	public int compareByVal(int val1, int val2) {
		compareCount++;
		return val1 - val2;
	}

	/**
	 * 交换位置
	 * 
	 * @param idx1
	 * @param idx2
	 */
	public void swap(int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
		swapCount++;
	}

}
