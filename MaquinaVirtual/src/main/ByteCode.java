package main;

/**
 * Clase que implementa las distintas instrucciones bytecode que puede manejar nuestra maquina virtual
 */
public class ByteCode {
	private ENUM_BYTECODE name;
	private int param;//necesario para las instrucciones PUSH, STORE, LOAD
	/**
	 * constructor por defecto
	 * @return
	 */
	public int getParam() {
		return this.param;
	}
	/**
	 * 
	 * @param name
	 */
	public ByteCode (ENUM_BYTECODE name ) {
		this.name=name;
	}
	public ByteCode (ENUM_BYTECODE name, int param ) {
		this.name=name;
		this.param = param;
	}
	
	public ENUM_BYTECODE getBytecode() {
		return this.name;
	}
	
	
	

}

//METODO TOSTRING  devuelve el 
//metodo parser
