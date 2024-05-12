package com.myList;

public class SwapAdjacentNodes {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
		//list.show();
		
		Node head = list.head;
		
		Node temp = head;
		head = temp.next;
		
		Node prev = temp;
		Node curr = head;
		
		while(curr != null){
			Node tmp = curr.next;
			
			
			curr.next = prev;
			
			if(tmp != null)
			{
				prev.next = tmp.next;
				curr = tmp.next;
				prev = tmp;
			}else{
				prev.next = null;
				prev = null;
				curr = null;
			}
		}
		
		list.head = head;
		
		list.show();
		
	}
}
