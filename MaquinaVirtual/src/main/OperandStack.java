package main;

/**
 * clase OperandStack implementa la pila de operandos donde se van apilando elementos de tipo entero 
 * @author Mayra
 */
public class OperandStack {
	private int [] stack;// donde se almacenan los operandos 
	private final int MAX_STACK=100;//tamaño maximo de la pila 
	private int num_elem;
	
	/**
	 * constructor
	 */
	public OperandStack() {
		this.num_elem=0;
		this.stack = new int [this.MAX_STACK];		
	}
	
	/**
	 * retorna 
	 * @return
	 */
	public String toString() {
		String cadena="Pila: ";
		if(this.isEmpty()) {
			cadena+= "<vacia>";
		}else {
			for(int i=0; i< this.num_elem;i++)
				cadena+=" "+ this.stack[i];
		}
		return cadena;		
	}	
	/**
	 * pregunta si la pila esta vacia 
	 * @return false o true 
	 */
	public boolean isEmpty() {
		if(this.MAX_STACK>0)
			return false;
		else
			return true;		
	}
	
	/**
	 * 
	 * @param numero se añade
	 * @return retorna true si se ha podido añadir o false en caso contrario
	 */
	public boolean push(int numero) {
		if(this.num_elem>=this.MAX_STACK)
			return false;
		
		this.stack[this.num_elem] = numero;
		this.num_elem++;
		return true;
		
	}
	
	/**
	 * retorna  el elemento en la ultima posicion de num_elem ¿esta vacia? si no esta vacia 
	 * @return num_elem lo que hay en la posicion num_elem
	 */
	public int pop() {
		int aux = this.stack[this.num_elem-1];
		if(isEmpty()==false) {
			this.num_elem--;
			return aux;
		}else 
			return-1;	
	}
	/**
	 * valor en la cima de la pila 
	 * @return devuelve el numero almacenado en la cima de la pila 
	 */
	public int getCima() {
			
       return this.stack[this.num_elem-1];
	}

}
