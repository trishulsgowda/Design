package com.myList;

public class ReverseListInKGroup {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		Node head = extracted(list);
		
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println();
	}

	private static Node extracted(LinkedList list) {
		int k=3;
		Node prev = list.head;
		Node node = list.head;
		
		
		Node head = null;
		Node last = null;
		Node curr = null;
		Node cn = null;
		
		while(prev != null){
			int numberOfNode = 1;
			for(int i=1; i<k; i++){
				
				if(node.next == null) break;
				node = node.next;
				numberOfNode += 1;
			}
			
			if(head == null)
			head = node;
			
			if(last != null && numberOfNode == k){
				last.next = node;
			}else if(last !=null){
				last.next = prev;
				return head;
			}
			
			last = prev;
			curr = prev.next;
			
			for(int i=1; i<numberOfNode; i++){
				cn = curr.next;
				curr.next = prev;
				prev = curr;
				curr = cn;
			}
			prev = curr;
			node = prev;
			
		}
		
		last.next = null;
		return head;
	}
}
