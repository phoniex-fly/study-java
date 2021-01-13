package Study.Algorithm.sort.cmp.insertionSort;

import java.util.ArrayList;
import java.util.List;

import Study.Algorithm.sort.Sort;

public class ShellSort extends Sort {

	@Override
	public void concreteSort() {
		List<Integer> stepSeq = stepSeq();
		System.out.println("步长序列：" + stepSeq.toString());
		for (Integer step : stepSeq) {
			shellSort(step);
		}
	}

	/**
	 * 排序
	 * 
	 * @param step
	 */
	private void shellSort(Integer step) {
		for (int col = 0; col < step; col++) {
			// 比较col+0*step col+1*step col+2*step...
			for (int row = 1; col + row * step < array.length; row++) {
				int idx = row;
				while (idx > 0 && compareByIdx(col + idx * step, col + (idx - 1) * step) < 0) {
					swap(col + idx * step, col + (idx - 1) * step);
					idx--;
				}
			}
		}
	}

	/**
	 * 生成步长序列
	 * 
	 * @return
	 */
	private List<Integer> stepSeq() {
		List<Integer> stepSeq = new ArrayList<Integer>();
		int step = array.length;
		while ((step = step / 2) > 0) {
			stepSeq.add(step);
		}
		return stepSeq;
	}

}
