package com.singly.linkedlist;


//utility class for singlyLinkedList
public class SinglyLinkedListUtil {

	public static void main(String[] args) {
		SinglyLinkedList sin = new SinglyLinkedList();
		sin.insertAtBegining(new ListNode(1));
		sin.insertAtBegining(new ListNode(2));
		sin.insertAtBegining(new ListNode(3));
		sin.displayList();
		System.out.println("\n===============================");
		sin.insertAtEnd(new ListNode(4));
		sin.insertAtEnd(new ListNode(5));
		sin.insertAtEnd(new ListNode(6));
		sin.displayList();
		System.out.println("\n============inserting between nodes=========");
		sin.insertBetweenList(3, 99);
		sin.displayList();
		System.out.println("\n=========deletingbetweenlist============");
		sin.removeBetweenList(3);
		sin.removeFromStart();
		sin.removeFromLast();
		sin.displayList();
	}
	
}
