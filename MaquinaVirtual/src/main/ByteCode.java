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
	 * @param name nombrel del bytecode y paramatreo para las instrucciones de push, store y load
	 * @param param
	 */
	public ByteCode (ENUM_BYTECODE bc, int param ) {
		this.name=bc;
		this.param = param;
	}
	/**
	 * 
	 * @return nombre del bytecode
	 */
	public ENUM_BYTECODE getBytecode() {
		return this.name;
	}
	/**
	 * 
	 * @return retorna el parametro del bytecode 
	 */
	public int getParam() {
		return this.param;
	}	

}

