package Study.Algorithm.sort.uncmp.countingSort;

import Study.Algorithm.sort.Sort;

/**
 * 计数排序：适用于一定范围的正整数进行排序
 * 
 * @author user
 *
 */
public class CountingSort extends Sort {

	@Override
	public void concreteSort() {
		// 找到最大值
		int max = findMax();
		// 记录数据出现次数
		int[] counts = count(max);
		// 排序
		countSort(max, counts);

	}

	private void countSort(int max, int[] counts) {
		int arrIdx = 0;
		for (int i = 0; i < counts.length; i++) {
			while (counts[i] > 0) {
				array[arrIdx++] = i;
				counts[i]--;
			}
		}
	}

	private int[] count(int max) {
		int[] counts = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			counts[array[i]]++;
		}
		return counts;
	}

	private int findMax() {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
