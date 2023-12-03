package com.kk.linklist;
public class LinkedList {
	public static void main(String[] args) {
		//{3,4,5}
		Node n1 = new Node(3);
		Node n2 = new Node(4);
		n1.next = n2;
		Node n3 = new Node(5);
		n2.next = n3;
		Node head = n1;
//		countNode(head);
//		printNode(head);
//		printNodeIsEven(head);
//		reverseNode(head);
		//addNodeAtFirst(head,1);
		addNodeAtLast(head,6);

	}

	private static void addNodeAtLast(Node head, int value) {
		System.out.println("Added new at last position : "+value);
		Node temp=new Node(value);
		 Node current=head;
		 while(current.next!=null) {
			 current=current.next;
		 }
		 current.next=temp;
		 printNode(head);
		 
		
	}

	private static void addNodeAtFirst(Node head, int value) {
		 Node current=new Node(value);
		 current.next=head;
		 head=current;
		 printNode(head);
		
	}

	private static void reverseNode(Node head) {
		System.out.println("Reverse Node");
		 Node current=head,prev=null,next=null;
		 while(current!=null) {
			 next=current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
		 }
		 head=prev;
		reverseNodeValue(head);
	}

	private static void reverseNodeValue(Node head) {
		 Node current=head;
		 while(current!=null) {
			 System.out.print(current.data+ " ");
			 current=current.next;
		 }
	}

	private static void printNodeIsEven(Node head) {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		if (count % 2 == 0) {
			System.out.println(" \n It is Even node");
		} else {
			System.out.println("\n It is odd node");
		}
	}

	private static void countNode(Node head) {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println("Count Node : " + count);

	}

	private static void printNode(Node head) {
		System.out.print("Printed node is : ");
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
