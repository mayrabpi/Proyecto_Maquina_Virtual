package main;

/**
 * Clase que implementa las distintas instrucciones bytecode que puede manejar nuestra maquina virtual
 */
public class ByteCode {
	private ENUM_BYTECODE name;
	private int param;//necesario para las instrucciones PUSH, STORE, LOAD
	
	
	/**
	 * 
	 * @param bc
	 */
	public ByteCode (ENUM_BYTECODE bc ) {
		this.name=bc;
	}
	/**
	 * 
	 * @param name
	 * @param param
	 */
	public ByteCode (ENUM_BYTECODE bc, int param ) {
		this.name=bc;
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

}

