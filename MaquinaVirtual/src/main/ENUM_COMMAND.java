package main;

/**
 * 
 */
public enum ENUM_COMMAND {
	HELP, QUIT, NEWINST(1), RUN, RESET, REPLACE(1);
	private int valueArg;
	
	/**
	 * Constructora 1
	 */
	ENUM_COMMAND(){
		this.valueArg=0;
	}
	
	/**
	 * Constructora 2 
	 * @param n
	 */
	ENUM_COMMAND(int n){
		this.valueArg =n;
	}
	
	/**
	 * Devuelve el numero de parametros que tiene un comando
	 * @return
	 */
	public int getValueArg() {
		return this.valueArg;
	}

}
