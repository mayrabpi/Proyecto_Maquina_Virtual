package main;

/**
 * clase Memory
 * @author Mayra
 */
public class Memory {
	private Integer memory[];
	private final int MAX_MEMORY = 100;
	private int size;
	private boolean empty;
	
	/**
	 * constructor
	 */
	public Memory() {
		this.size=10;
		this.memory = new Integer [this.MAX_MEMORY];
		this.empty=true;
	}
	
	/**
	 * escribe  el valor en  la posicion value en la posicion pos
	 * @param pos mayor que cero 
	 * @param value cima de la pila 
	 * @return
	 * llamar resize 
	 */
	public boolean write(int pos, int value) {
		
		if(pos>=0) {
			this.resize(pos);
		    this.memory[pos]= value;
		    return true;
		}else
			return false;
	}
	
	/**
	 * 
	 * @param recibe la posicion pos
	 * @return el valor que haya en la posicion pos, si en pos hay null se devuelve -1
	 */
	public Integer read(int pos) {
		if(this.memory[pos]==null) {
			return -1;
		}else
		    return this.memory[pos];
	}
	
	/**
	 * multiplica el tamaño del array por 2 , crea un nuevo array con el doble del tamaño del array
	 */
	public void resize(int posicion) {
		if(posicion>=this.size) {
			this.empty=false;
			Integer[] newMemory = new Integer [posicion*2];
			newMemory =this.memory;
			this.memory=newMemory;
		}
		
	}
	
	


}
