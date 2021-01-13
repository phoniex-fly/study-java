package Study.Algorithm.sort.cmp.selectionSort;

import Study.Algorithm.sort.Sort;

public class SelectionSort extends Sort {

	/**
	 * 选择最大的一个数据与最后一个数据进行交换
	 * 
	 * @param array
	 */
	@Override
	public void concreteSort() {
		for (int i = 0; i < array.length; i++) {
			int maxIdx = 0;
			for (int j = 0; j < array.length - i; j++) {
				if (compareByIdx(j, maxIdx) > 0) {
					maxIdx = j;
				}
			}
			swap(array.length - 1 - i, maxIdx);
		}
	}

	public void selectionSort() {
		for (int i = 0; i < array.length; i++) {
			int maxIdx = 0;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[maxIdx]) {
					maxIdx = j;
				}
			}
			int tmp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[maxIdx];
			array[maxIdx] = tmp;
		}
	}

}
