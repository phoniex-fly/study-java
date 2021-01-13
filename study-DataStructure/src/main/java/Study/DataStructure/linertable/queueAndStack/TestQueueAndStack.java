package Study.DataStructure.linertable.queueAndStack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 将十进制转换为二进制:LinkedList的父类有list/deque/queue,所以可作为链表、栈、队列使用
 * 
 * @author HelloWorld
 *
 */
public class TestQueueAndStack {
	public static void main(String[] args) {
		toBinary(13);
	}

	public static void toBinary(int num) {
		Deque<Integer> deque = new LinkedList<>();
		while (num > 0) {
			int mod = num % 2;
			deque.push(mod);
			num /= 2;
		}
		while (deque.size() > 0) {
			System.out.print(deque.pop());
		}
	}

}
