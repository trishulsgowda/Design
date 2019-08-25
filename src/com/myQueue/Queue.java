package com.myQueue;

public class Queue {

	private Node head = null;
	private int size = 0;
	private static final int MAX_SIZE = 5; 
	
	public void add(int data){
		if(head == null){
			head = new Node(data);
			size++;
			return;
		}
		
		Node cur = head;
		while(cur.next != null){
			cur = cur.next;
		}
		cur.next = new Node(data);
		size++;
	}
	
	public int remove(){
		int result = head.data;
		head = head.next;
		size--;
		return result;
	}
	
	public void displayQueue(){
		Node cur = head;
		
		while(cur != null){
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}
	
	public int size(){
		return this.size;
	}
}


class Node
{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
