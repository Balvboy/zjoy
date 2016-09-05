package zjoy.research.linklist;

import java.util.Random;

public class TestLinkList {
	
	public  static void TestSync(int number){
//		int number = new Random().nextInt(10);
		System.out.println(number);
		if(number>5){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);

		System.out.println(node1);
		sort(node1, 4);
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				TestSync(10);
//			}
//		}).start();
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				TestSync(4);
//			}
//		}).start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				TestSync(8);
//			}
//		}).start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				TestSync(3);
//			}
//		}).start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				TestSync(7);
//			}
//		}).start();
//		
		
	}

	/**
	 * 从开始节点对链表进行指定长度的部分反转
	 * @param h
	 * @param number
	 */
	static void sort(Node h, int number) {
		Node oh = h; Node t = h.next; Node old = t.next; int n = 0;
		while (n < number - 1) {
			t.next = h;
			h = t;
			t = old;
			old = old.next;
			n++;
		}
		oh.next = t;
		System.out.println(h);
	}
}
class Node {
	int value;
	Node next;
	public Node() {

	}

	public Node(int value) {
		this.value = value;
		// this.next = next;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.value);
		Node node = this;
		while (node.next != null) {
			sb.append("->" + node.next.value);
			node = node.next;
		}
		return sb.toString();
		// return super.toString();
	}

}
