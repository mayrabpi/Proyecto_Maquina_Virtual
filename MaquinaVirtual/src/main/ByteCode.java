package main;

/**
 * 
 */
public class ByteCode {
	private ENUM_BYTECODE name;
	private int param;
	
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
	
	public int getParam() {
		return this.param;
	}

}
//METODO TOESTRING 
//metodo parser
