package Study.Algorithm;

public class QuickSort {
	public static void main(String[] args) {
//		int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
		int[] arr = { 27, 31, 42, 8, 5, 3, 10 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("�����:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			// ��Ѱ��׼���ݵ���ȷ����
			int index = getIndex(arr, low, high);

			// ���е�����index֮ǰ��֮������������ͬ�Ĳ���ʹ��������������
			// quickSort(arr, 0, index - 1); ֮ǰ�İ汾�����������кܴ���������⣬лл��ҵĽ���
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}

	}

	private static int getIndex(int[] arr, int low, int high) {
		// ��׼����
		int tmp = arr[low];
		while (low < high) {
			// ����β��Ԫ�ش��ڵ��ڻ�׼����ʱ,��ǰŲ��highָ��
			while (low < high && arr[high] >= tmp) {
				high--;
			}
			// �����βԪ��С��tmp��,��Ҫ���丳ֵ��low
			arr[low] = arr[high];
			// ������Ԫ��С�ڵ���tmpʱ,��ǰŲ��lowָ��
			while (low < high && arr[low] <= tmp) {
				low++;
			}
			// ������Ԫ�ش���tmpʱ,��Ҫ���丳ֵ��high
			arr[high] = arr[low];

		}
		// ����ѭ��ʱlow��high���,��ʱ��low��high����tmp����ȷ����λ��
		// ��ԭ���ֿ��Ժ������֪��lowλ�õ�ֵ������tmp,������Ҫ��tmp��ֵ��arr[low]
		arr[low] = tmp;
		return low; // ����tmp����ȷλ��
	}
}
