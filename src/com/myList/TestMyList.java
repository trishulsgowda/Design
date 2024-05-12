package com.myList;

public class TestMyList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		/*Node temp;
		Node cur;
		Node head = list.head;
		temp = head.next;
		head.next = null;
		cur = temp;
		
		while(temp != null){
			cur = cur.next;
			temp.next = head;
			head = temp;
			temp = cur;
		}
		
		list.head = head;*/
		//list.show();
		//list.reverse();
		//list.show();
		
		// Reverse a sublist
		/*int gm = 3, gn=6;
		
		Node head = list.head;
		Node temp = head;
		Node prev = null;
		int m=1;
		while(m!= gm){
			prev  = temp;
			temp = temp.next;
			m++;
		}
		Node h = temp;
		Node s = temp;
		Node t = h.next;
		Node cur = t;
		int n=1;
		while(n!=(gn-gm)){
			cur = cur.next;
			t.next = h;
			h = t;
			t = cur;
			n++;
		}
		
		prev.next = h;
		s.next = cur;
		
		list.head = head;*/
		
		list.show();
		list.rotate();
		list.show();
	}
}
