package main;

/**
 * clase Memory representa la memoria de la maquina 
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
		this.size=2;
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
	public void write(int pos, int value) {
		if(pos>=this.size)
			this.resize(pos);
		
		    this.memory[pos]=value;
		    empty =false;
		
	}
	
	/**
	 * 
	 * @param recibe la posicion pos
	 * @return el valor que haya en la posicion pos, si en pos hay null se devuelve -1
	 */
	public int read(int pos) {
		if(this.memory[pos]==null) {
			return -1;
		}else
		    return this.memory[pos];
	}
	
	/**
	 * multiplica el tamaño del array por 2 , crea un nuevo array con el doble del tamaño del array
	 */
	public void resize(int posicion) {
	int newSize= posicion*2;
	Integer[]newMemory =new Integer[newSize];
	for(int i=0; i<this.size;i++) {
		newMemory[i]=this.memory[i];
	}
	this.memory=newMemory;
	this.size=newSize;
	}
	
	public String tooString() {
		String cadena="Memoria:";
		if(this.empty) {
			cadena+="<vacia>";
		}else {
			for(int i =0;i<this.size;i++) {
				if(this.memory[i]!=null)
					cadena+= "[" +i+ "]:[" + this.memory[i]+ "]" + ",";
			}
		}
		return cadena;
		
	
	

	}
}
/*
 * if(posicion>=this.size) {
			this.empty=false;
			Integer[] newMemory = new Integer [posicion*2];
			newMemory =this.memory;
			this.memory=newMemory;
		}*/
