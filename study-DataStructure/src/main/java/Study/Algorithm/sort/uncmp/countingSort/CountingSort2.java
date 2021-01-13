package Study.Algorithm.sort.uncmp.countingSort;

import java.util.Arrays;

import Study.Algorithm.sort.Sort;

/**
 * 计数排序优化：适用于一定范围的正整数进行排序
 * 
 * @author user
 *
 */
public class CountingSort2 extends Sort {

	@Override
	public void concreteSort() {
		// 找到最值
		int max = findMax();
		int min = findMin();
		// 记录数据出现次数
		int[] counts = count(max, min);
		System.out.println(Arrays.toString(counts));
		// 排序
		countSort(min, counts);

	}

	/**
	 * 计数排序
	 * 
	 * @param max
	 * @param counts
	 */
	private void countSort(int min, int[] counts) {
		int arrIdx = 0;
		for (int i = 0; i < counts.length; i++) {
			int count = i == 0 ? counts[0] : counts[i] - counts[i - 1];
			while (count > 0) {
				array[arrIdx++] = i + min;
				count--;
			}
		}
	}

	/**
	 * 生成辅助数组
	 * 
	 * @param max
	 * @param min
	 * @return
	 */
	private int[] count(int max, int min) {
		int[] counts = new int[max - min + 1];
		for (int i = 0; i < array.length; i++) {
			counts[array[i] - min]++;
		}
		for (int i = 1; i < counts.length; i++) {
			counts[i] += counts[i - 1];
		}
		return counts;
	}

	/**
	 * 查找最大值
	 * 
	 * @return
	 */
	private int findMax() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * 查找最小值
	 * 
	 * @return
	 */
	private int findMin() {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
