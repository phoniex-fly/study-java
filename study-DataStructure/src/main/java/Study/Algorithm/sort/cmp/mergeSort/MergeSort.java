package Study.Algorithm.sort.cmp.mergeSort;

import Study.Algorithm.sort.Sort;

public class MergeSort extends Sort {

	private int[] leftArr;

	@Override
	public void concreteSort() {
		leftArr = new int[array.length >> 1];
		sort(0, array.length);
	}

	/**
	 * 将[begin,end)范围内的数据进行切分
	 * 
	 * @param begin
	 * @param end
	 */
	public void sort(int begin, int end) {
		if (end - begin < 2) {
			return;
		}
		int mid = (begin + end) >> 1;
		sort(begin, mid);
		sort(mid, end);
		merge(begin, mid, end);
	}

	/**
	 * 将[begin,mid),[mid,end)数组合并
	 * 
	 * @param begin
	 * @param mid
	 * @param end
	 */
	private void merge(int begin, int mid, int end) {
		int li = 0, le = mid - begin;
		int ri = mid, re = end;
		int ai = begin;

		// 准备左边数组
		for (int i = li; i < le; i++) {
			leftArr[i] = array[begin + i];
		}

		while (li < le) {// 如果左边还没有结束
			if (ri < re && compareByVal(leftArr[li], array[ri]) > 0) {
				array[ai++] = array[ri++];
			} else {
				array[ai++] = leftArr[li++];
			}
		}
	}

}
