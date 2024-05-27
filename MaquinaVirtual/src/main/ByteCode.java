package main;

/**
 * Clase que implementa las distintas instrucciones bytecode que puede manejar nuestra maquina virtual
 */
public class ByteCode {
	private ENUM_BYTECODE name;
	private int param;//necesario para las instrucciones PUSH, STORE, LOAD
	
	public ByteCode () {
		
	}
	/**
	 * 
	 * @param name
	 */
	public ByteCode (ENUM_BYTECODE name ) {
		this.name=name;
	}
	/**
	 * 
	 * @param name
	 * @param param
	 */
	public ByteCode (ENUM_BYTECODE name, int param ) {
		this.name=name;
		this.param = param;
	}
	/**
	 * 
	 * @return
	 */
	public ENUM_BYTECODE getBytecode() {
		return this.name;
	}
	/**
	 * 
	 * @return
	 */
	public int getParam() {
		return this.param;
	}
	
	public String toString() {
		return this.name.toString().toUpperCase() + this.param;
	}
	
	
	
	

}

//METODO TOSTRING  devuelve el 
//metodo parser
