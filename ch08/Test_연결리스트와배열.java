package com.ruby.java.ch08;

class Node3 {
	int data;
	Node3 link;

	public Node3(int data) {
		this.data = data;
		link = null;
	}
}

class LinkedList3 {
	Node3 first; //// int대신 Node

	void append(int data) {
		Node3 p = first, q = null;
		Node3 newNode = new Node3(data);
		if (p == null) {
			first = newNode;
		} else {
			while (p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}

	}

	public LinkedList3() {
		first = null;
	}

	void showList() {
		System.out.println();
		Node3 p = first;
		while (p != null) {
			if (p.data < 10) {
				System.out.print(" " + p.data + " ");
			} else {
				System.out.print(p.data + " ");
			}
			p = p.link;
		}
	}

	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;
		if (p == null) {
			first = newNode;
		} else {
			while (p != null) {
				if (p.data > data) {
					newNode.link = p;
					if (q == null) {
						first = newNode;
					} else {
						q.link = newNode;
					}
					break;
				} else {
					q = p;
					p = p.link;
				}
			}
		}
	}

}

public class Test_연결리스트와배열 {
	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++;
		}
		return count;
	}

	static void showList(int[] data) {
		System.out.println();
		for (int i = 0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i] + " ");
		}
	}

	static int insertList(int[] data, int count, int x) {
		int indx = 0;
		while (indx < count) {
			if (x < data[indx]) {
				while (indx <= count) {
					int tmp = data[indx];
					data[indx] = x;
					x = tmp;
					indx++;
				}
			} else {
				indx++;
			}
		}
		return ++count;

	}

	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;
		System.out.print("배열로 리스트");
		count = getList(list);
		showList(list);
		count = insertList(list, count, 3);
		showList(list);
		count = insertList(list, count, 7);
		showList(list);

		LinkedList3 ll = new LinkedList3();
		System.out.println();
		System.out.print("연결리스트로 리스트");
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.append(25);
		ll.showList();
		ll.insert(3);
		ll.showList();
		ll.insert(7);
		ll.showList();

	}
}
