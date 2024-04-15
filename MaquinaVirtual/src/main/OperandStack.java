package main;

/**
 * clase OperandStack
 * @author Mayra
 */
public class OperandStack {
	private int [] stack;
	private final int MAX_STACK=20;
	private int num_elem;
	
	/**
	 * constructor
	 */
	public OperandStack() {
		this.num_elem=1;
		this.stack = new int [this.MAX_STACK];		
	}
	
	/**
	 * retorna 
	 * @return
	 */
	public String tooString() {
		return "";
	}
	
	/**
	 * pregunta si la pila esta vacia 
	 * @return false o true 
	 */
	public boolean isEmpty() {
		return this.num_elem==0;
	}
	
	/**
	 * introduce un elemento en el array 
	 * @param numero
	 */
	public boolean push(int numero) {
		if(this.num_elem<this.MAX_STACK) {
			numero = this.stack[this.num_elem];
			this.num_elem++;
			return true;
		}else {
			System.out.println("No es podible introducir mas operaciones");
			return false;
		}
		
	}
	
	/**
	 * retorna  el elemento en la ultima posicion de num_elem ¿esta vacia? si no esta vacia 
	 * @return num_elem lo que hay en la posicion num_elem
	 */
	public int pop() {
		return this.num_elem-1;
	}

}
