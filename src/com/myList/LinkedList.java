package com.myList;

public class LinkedList {

	Node head;
	Node tail;
	
	public LinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	public void add(int item){
		Node node = new Node(item);
		if(head == null && tail == null){
			head = node;
			tail = node;
		}/*else if((head != null && tail != null) && head == tail){
			head.next = node;
			tail = head.next;
		}*/else{
			tail.next = node;
			tail = tail.next;
		}
	}
	
	public void show(){
		Node curr = head;
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while(curr != null){
			if(!sb.toString().equals("["))
			sb.append(sb.length()!=0 ? "," : "");
			sb.append(curr.data);
			curr = curr.next;
		}
		sb.append("]");
		
		System.out.println(sb.toString());
	}
	
	public void reverse(){
		Node temp;
		Node cur;
		Node tempHead = head;
		temp = tempHead.next;
		tempHead.next = null;
		cur = temp;
		
		while(temp != null){
			cur = cur.next;
			temp.next = tempHead;
			tempHead = temp;
			temp = cur;
		}
		
		head = tempHead;
	}

	public void rotate() {
		Node tmp = null;
		tail.next = head;
		tmp = head.next;
		head.next = null;
		tail = head;
		head = tmp;
	}
}
