package com.singly.linkedlist;

public class SinglyLinkedList {

	/**
	 * Author : NIkhil Yedke
	 * 
	 * 
	 */
	// head
	ListNode head;

	// length of the list
	int length;

	// default constructor
	public SinglyLinkedList() {
		length = 0;
	}

	// getTheHead
	public ListNode getHead() {
		return head;
	}

	// insert the node at start of a list
	public void insertAtBegining(ListNode node) {
		if (head == null)
			head = node;
		else {
			node.setNext(head);
			head = node;
		}
		length++;
	}

	// insert Node at end
	public void insertAtEnd(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		length++;
	}

	// insert the node in between list
	public void insertBetweenList(int position, int data) {
		if (position < 0 || position > length + 1)
			System.out.println("cannot add at this position.");
		else if (position == 0)
			insertAtBegining(new ListNode(data));
		else if (position == length)
			insertAtEnd(new ListNode(data));
		else {
			ListNode temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			}
			ListNode remainingList = temp.getNext();
			ListNode insertBtnNode = new ListNode(data);
			temp.setNext(insertBtnNode);
			insertBtnNode.setNext(remainingList);
		}

		length++;
	}

	// remove from start
	public void removeFromStart() {
		ListNode temp = head.getNext();
		head = null;
		head = temp;

		length--;
	}

	// remove from end
	public void removeFromLast() {
		ListNode temp = head;
		for (int i = 1; i < length - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		length--;
	}

	// remove in between the list
	public void removeBetweenList(int position) {
		if (position < 0 || position > length + 1)
			System.out.println("cannot perform this action");
		else if (position == 0)
			removeFromStart();
		else if (position == length)
			removeFromLast();
		else {
			ListNode temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			}
			ListNode removeNode = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			removeNode = null;
		}
		length--;
	}

	// display the list
	public void displayList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
	}
}
