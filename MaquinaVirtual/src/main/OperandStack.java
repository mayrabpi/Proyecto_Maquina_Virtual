package main;

/**
 * 
 */
public class OperandStack {
	private int stack[];
	private final int MAX_STACK=20;
	private int num_elem;
	
	public OperandStack() {
		this.num_elem=1;
		this.stack = new int [this.MAX_STACK];		
	}
	
	/**
	 * 
	 * @return
	 */
	public String tooString() {
		return " ";
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean insEmpty() {
		return true;
	}
	
	/*
	 * 
	 * 
	 */
	public void push() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int pop() {
		return this.num_elem;
	}

}
