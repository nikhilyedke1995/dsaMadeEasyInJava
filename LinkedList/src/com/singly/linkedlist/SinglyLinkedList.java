package com.singly.linkedlist;

public class SinglyLinkedList {

	/**
	 * Author : NIkhil Yedke
	 * 
	 * 
	 */
	
	//Node class 
	public class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

	}	
	
	public ListNode creatNode(int data) {
		return new ListNode(data);
	}
	
	//defines the length of the list
	int length ;
	ListNode head;
	
	public ListNode getHead() {
		return head;
	}
	
	public SinglyLinkedList() {
		length = 0;
	}
	
	//insertTheData
	public void insertNode(ListNode temp) {
		if(head == null)
			head = temp;
		else {
			while(head.getNext() != null )
				head = head.getNext();
			head.setNext(temp);
		}
	}
	
	public void printList(){
		while(head.getNext() != null) {
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.insertNode(s.creatNode(1));
		s.insertNode(s.creatNode(2));
		s.printList();
	}
	
}
