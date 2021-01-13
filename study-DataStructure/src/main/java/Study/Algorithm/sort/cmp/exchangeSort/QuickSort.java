package Study.Algorithm.sort.cmp.exchangeSort;

import Study.Algorithm.sort.Sort;

public class QuickSort extends Sort {

	@Override
	public void concreteSort() {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * 快速排序
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	static void quickSort(int[] array, int low, int high) {
		// 选取基准值
		int partition = partition(array, low, high);
		quickSort(array, low, partition - 1);
		quickSort(array, partition + 1, high);
	}

	/**
	 * 分区
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	static int partition(int[] array, int low, int high) {
		int tmp = array[low];
		while (low < high) {
			while (low < high && array[high] >= tmp) {
				high--;
			}
			array[low] = array[high];
			while (low < high && array[low] <= tmp) {
				low++;
			}
			array[high] = array[low];
		}
		array[low] = tmp;
		return low;
	}

}
