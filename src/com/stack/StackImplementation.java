package com.stack;

public class StackImplementation {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		try {
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			System.out.println(s.top());
			System.out.println(s.size());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Stack{
	
	public Stack() {
	}
	
	int[] st = new int[10];
	int top=-1;
	
	public void push(int item) throws Exception{
		if(top >= st.length) throw new Exception("Stack is full");
		
		top = top + 1;
		st[top] = item;
	}
	
	public int pop() throws Exception{
		if(top < 0) throw new Exception("Stack is empty");
		
		int res = st[top];
		top = top -1;
		return res; 
	}
	
	public int top() throws Exception{
		if(top < 0) throw new Exception("Stack is empty");
		
		return st[top];
	}
	
	public int size(){
		return top+1;
	}
}
