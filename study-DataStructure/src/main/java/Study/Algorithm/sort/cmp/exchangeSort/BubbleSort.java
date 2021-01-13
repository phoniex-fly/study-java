package Study.Algorithm.sort.cmp.exchangeSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// 初始化数组、排序
		// int[] array = { 2, 5, 3, 1, 9, 5, 3, 7, 8 };
		int[] array = { 1, 2, 5, 4, 5, 4, 7, 3, 9 };
		// 排序
		// bubbleSort1(array);
		// bubbleSort2(array);
		bubbleSort3(array);
		// 输出数组
		System.out.println(Arrays.toString(array));
	}

	/**
	 * 普通冒泡
	 * 
	 * @param array
	 */
	static void bubbleSort1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	/**
	 * 冒泡优化：已排好序 缺点：已排好序概率较小
	 * 
	 * @param array
	 */
	static void bubbleSort2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean sorted = true;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
		}
	}

	/**
	 * 冒泡优化：记录最后一次交换的位置，最后已排好序的位置无需再进行比较交换
	 * 
	 * @param array
	 */
	static void bubbleSort3(int[] array) {
		int sortedMaxIdx = array.length;
		for (int i = 0; i <= sortedMaxIdx; i++) {
			System.out.println(i + "轮");
			sortedMaxIdx = 0;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					System.out.println("交换" + array[j] + "," + array[j + 1]);
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					sortedMaxIdx = j + 1;
				}
			}
			System.out.println(Arrays.toString(array) + "----sortedMaxIdx=" + sortedMaxIdx);
		}
	}

}
