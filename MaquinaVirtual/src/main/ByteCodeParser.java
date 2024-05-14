package main;

/**
 * clase encargada de parsear un string que contiene un posible bytecode
 */
public class ByteCodeParser {
	private int byteCode;
	
	public ByteCodeParser() {
	
		
	}
	
	/**
	 * Metodo que devuelve el bytecode almacenado en s  o bien null si s no representa ningun comando
	 * @param cadena de texto que puede 
	 * @return el byteCode almacenado en s o bien null si s no representa ningun comando
	 */
	public static ByteCode parse(String s) {
		ENUM_BYTECODE code = null;
		ByteCode ins =null;
		String aux[]=s.split("");
		int longitudArray = aux.length;
		
		switch (longitudArray) {
		    case 1 :
		    	if(aux[0].equalsIgnoreCase("ADD")) {
		    		code = ENUM_BYTECODE.ADD;
		    	}
		    	else if (aux[0].equalsIgnoreCase("SUB")) {
		    		code = ENUM_BYTECODE.SUB;
		    	}
		    	else if (aux[0].equalsIgnoreCase("MUL")) {
		    		code = ENUM_BYTECODE.MUL;
		    	}
		    	else if (aux[0].equalsIgnoreCase("DIV")) {
		    		code = ENUM_BYTECODE.DIV;
		    	}
		    	else if (aux[0].equalsIgnoreCase("OUT")) {
		    		code = ENUM_BYTECODE.OUT;
		    	}
		    	else if (aux[0].equalsIgnoreCase("HALT")) {
		    		code = ENUM_BYTECODE.HALT;
		    	}
		    	else 
		    		code=null;
		    	
		    	if(code!=null) 
		    		return ins = new ByteCode(code);
		    	break;
		    case 2:
		    	if(aux[0].equalsIgnoreCase("PUSH")) {
		    		code = ENUM_BYTECODE.PUSH;
		    	}
		    	else if (aux[0].equalsIgnoreCase("LOAD")) {
		    		code = ENUM_BYTECODE.LOAD;
		    	}
		    	else if (aux[0].equalsIgnoreCase("STORE")) {
		    		code = ENUM_BYTECODE.STORE;
		    	}
		    	else {
		    		code =null;
		    	}
		    	if(code!=null)
		    		ins = new ByteCode(code, Integer.parseInt(aux[1]));
		    	
		    	break;		
		}
		return ins;
	}

}
// recibe un string y hace un split hay q identificar con if else return add, return push, etc