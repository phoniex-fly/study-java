package Study.Algorithm.sort.cmp.insertionSort;

import Study.Algorithm.sort.Sort;

/**
 * 第i个元素插入0~i-1元素之间合适的位置
 * 
 * @author user
 *
 */
public class InsertionSort extends Sort {

	/**
	 * 两两交换
	 */
	// @Override
	public void concreteSort1() {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (compareByIdx(j - 1, j) > 0) {
					swap(j - 1, j);
				}
			}
		}
	}

	/**
	 * 优化：交换变为挪动
	 */
	@Override
	public void concreteSort() {
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (array[j] > tmp) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = tmp;
		}
	}

	/**
	 * 优化：二分查找合适的位置
	 */
	public void concreteSort2() {
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (array[j] > tmp) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = tmp;
		}
	}

}
