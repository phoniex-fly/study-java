package Study.Algorithm.search;

import java.util.Arrays;

/**
 * 折半查找 1、先排序。后折半
 * 
 * T(n) = o(n) S(n) = o(1)
 * 
 * @author HelloWorld
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int key = 10;
		int search = binarySearch(arr, key);
		System.out.println(search);

	}

	/**
	 * 非递归
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;
	}

	/**
	 * 递归:不正确
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int search2(int[] arr, int key) {
		int high = arr.length - 1;
		int mid = high / 2;

		if (key == arr[mid]) {
			return mid;
		}

		int[] subArr = null;
		if (key > arr[mid]) {
			subArr = Arrays.copyOfRange(arr, mid + 1, arr.length);
		} else {
			subArr = Arrays.copyOfRange(arr, 0, mid);
		}
		if (subArr.length > 0) {
			return search2(subArr, key);
		}
		return -1;
	}
}
