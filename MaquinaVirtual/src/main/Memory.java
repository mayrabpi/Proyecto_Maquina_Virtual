package main;

/**
 * clase Memory
 * @author Mayra
 */
public class Memory {
	private Integer memory[];
	private final int MAX_MEMORY = 100;
	private int size;
	
	/**
	 * constructor
	 */
	public Memory() {
		this.size=100;
		this.memory = new Integer [this.MAX_MEMORY];
	}
	
	/**
	 * escribe  el valor en  la posicion value en la posicion pos
	 * @param pos
	 * @param value
	 * @return
	 */
	public boolean write(int pos, String value) {
		return true;
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public Integer read(int pos) {
		return pos;
	}
	
	/**
	 * multiplica el tamaño del array por 2 , crea un nuevo array con el doble del tamaño del array
	 */
	public void resize() {
		
	}
	
	


}
