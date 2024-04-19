package main;

/**
 * 
 * 
 */
public class CPU {
	private OperandStack pila;
	private Memory memoria;
	private boolean halt;
	
	/**
	 * constructora
	 */
	public CPU() {
		this.memoria =new Memory();
		this.pila= new OperandStack();
		this.halt = false;
		
	}

}
