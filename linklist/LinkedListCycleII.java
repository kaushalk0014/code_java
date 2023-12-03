package com.kk.linklist;

/*https://leetcode.com/problems/linked-list-cycle-ii/
*/
public class LinkedListCycleII {

	/*
	 * Given the head of a linked list, return the node where the cycle begins. If
	 * there is no cycle, return null.
	 * 
	 * There is a cycle in a linked list if there is some node in the list that can
	 * be reached again by continuously following the next pointer. Internally, pos
	 * is used to denote the index of the node that tail's next pointer is connected
	 * to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as
	 * a parameter.
	 */

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
		n5.next = n3;
		Node head = n1;
		int result=linkedListCycleII(head);
		System.out.println("Result : "+result);
	}

	private static int linkedListCycleII(Node head) {
		 Node slow=head;
		 Node fast=head;
		 int count=0;
		 while(fast!=null&&fast.next!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(fast==slow) {
				 Node current=head;
				 while(slow!=current) {
					 current=current.next;
					 slow=slow.next;
					 count++;
				 }
				return count;
			 }
		 }
		return count;
	}
}
