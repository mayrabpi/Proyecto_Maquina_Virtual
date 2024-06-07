package main;

/**
 * 
 */
public enum ENUM_BYTECODE {
	PUSH(1), LOAD(1), STORE(1), ADD, SUB, MUL, DIV, OUT, HALT;
	private int valuearg;
	/**
	 * Constructora
	 */
	ENUM_BYTECODE(){
		this (0);
	}
	
	/**
	 * Constructora
	 * @param n
	 */
	ENUM_BYTECODE(int n){
		this.valuearg=n;
	}
	
	/**
	 * Devuelve el numero de parametros que tiene una instruccion
	 * @return this.valuearg
	 */
	public int getValuearg() {
		return this.valuearg;
	}
	

}
