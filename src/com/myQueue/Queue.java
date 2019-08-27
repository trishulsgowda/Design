package com.myQueue;

public class Queue {

	private Node head = null;
	private int size = 0;
	public static final int MAX_SIZE = 5; 
	
	public synchronized void add(int data){
		if(head == null){
			head = new Node(data);
			size++;
			System.out.println("Added : " + data);
			return;
		}
		
		if(!isFull()){
			Node cur = head;
			while(cur.next != null){
				cur = cur.next;
			}
			cur.next = new Node(data);
			size++;
			this.notify();
		}else{
			try {
				System.out.println("Buffer is Full !");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Added : " + data);
	}
	
	public synchronized void remove(){
		if(!isEmpty()){
			int result = head.data;
			head = head.next;
			size--;
			System.out.println("Removed : " + result);
			this.notify();
		}else{
			try {
				System.out.println("Buffer is Empty !");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
	
	public boolean isEmpty(){
		if(size ==0){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if(size == MAX_SIZE){
			return true;
		}
		return false;
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
