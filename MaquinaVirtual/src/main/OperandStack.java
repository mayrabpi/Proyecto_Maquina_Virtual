package main;


public class OperandStack {
	private int stack[];
	private final int MAX_STACK=20;
	private int num_elem;
	
	public OperandStack() {
		this.num_elem=0;
		this.stack = new int [this.MAX_STACK];
		
	}

}
