package main;

/**
 * 
 * 
 */
public class CPU {
	private OperandStack pila;
	private Memory memoria;
	private boolean salir;
	
	/**
	 * constructora
	 */
	public CPU() {
		this.memoria =new Memory();
		this.pila= new OperandStack();
		this.salir = false;
		
	}
	public String toString() {
		return memoria.toString() + " " + pila.tooString();
	}
	
	public boolean execute (ByteCode bc) {
		return true;
	}

}
