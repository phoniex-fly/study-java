package Study.DataStructure.search;

/**
 * 顺序查找
 * 
 * T(n) = o(n) S(n) = o(1)
 * 
 * @author HelloWorld
 *
 */
public class Search2 {
	public static void main(String[] args) {
		int[] arr = { 100, 2, 54, 354, 5, 2, 6, 8, 10 };
		int key = 60;
		int search = search(arr, key);
		System.out.println(search);

	}

	public static int search(int[] arr, int key) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
