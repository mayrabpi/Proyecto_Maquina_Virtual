package main;

/**
 * clase Memory representa la memoria de la maquina 
 * @author Mayra
 */
public class Memory {
	private Integer memory[];//alamacena los valores 
	private final int MAX_MEMORY;
	private int size;
	private boolean empty;
	
	/**
	 * constructor
	 */
	public Memory() {
		this.size=10;
		this.MAX_MEMORY=100;
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
			this.empty =false;
			this.resize(pos);
		    this.memory[pos]=value;
		    
		    return true;
		}else 
			return false;
	}
	
	/**
	 * 
	 * @param recibe la posicion pos
	 * @return el valor que haya en la posicion pos, si en pos hay null se devuelve -1
	 */
	public int read(Integer pos) {
		if(this.memory[pos]==null ) {
			return -1;
		}else
		    return this.memory[pos];
	}
	
	/**
	 * 	  multiplica el tamaño del array por 2 , crea un nuevo array con el doble del tamaño del array
	 * @param posicion
	 */
	public void resize(int posicion) {
	if(posicion >= this.size) {
		//this.empty=false;
	    Integer[]newMemory =new Integer[posicion*2];
	    for(int i=0; i<this.memory.length;i++) {

		    newMemory[i]=this.memory[i];		    
	}
	
	this.memory=newMemory;
	this.size=newMemory.length;
	}
	}
	
	/**
	 * metodo que se encarga de imprimir si hay elementos en la memoria o vacia si no hay
	 */
	public String toString() {
		String cadena="Memoria:";
		if(this.empty) {
			cadena+="<vacia>";
		}else {
			for(int i =0;i<this.size;i++) {
				if(this.memory[i]!=null)
					cadena+= "[" +i+ "] :  " + this.memory[i]+  "  ";
			}
		}
		return cadena;
	
	}

}
