package Study.DataStructure.linertable.linked;

import Study.DataStructure.linertable.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new SingleLinkedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(2, 888);

		System.out.println(list.toString());
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}

}
