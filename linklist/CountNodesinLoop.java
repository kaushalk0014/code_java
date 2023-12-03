package com.kk.linklist;

//https://practice.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class CountNodesinLoop {
	public static void main(String[] args) {
		// {1,2,3,4,5}
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(5);
		n4.next = n5;
		n5.next = n2;
		Node head = n1;

		System.out.println("Total Node is in loop:"+countNodesinLoop(head));
	}

	private static int countNodesinLoop(Node head) {
		Node fast = head;
		Node slow = head;
		int count = 0;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				slow = slow.next;
				count++;
				while (slow != null) {
					count++;
					slow = slow.next;
					if (fast == slow) {
						return count;
					}
				}
			}
		}
		return count;
	}
}
