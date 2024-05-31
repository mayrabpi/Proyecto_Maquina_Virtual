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
		String[] aux = s.split(" ");
		
		switch ( aux.length) {
		case 1:
			if(aux[0].equalsIgnoreCase("add")) {
				return new ByteCode(ENUM_BYTECODE.ADD);
			}
			else if(aux[0].equalsIgnoreCase("div")) {
				return new ByteCode(ENUM_BYTECODE.DIV);
			}
			else if ( aux[0].equalsIgnoreCase("mul")) {
				return new ByteCode(ENUM_BYTECODE.MUL);
			}
			else if ( aux[0].equalsIgnoreCase("sub")) {
				return new ByteCode(ENUM_BYTECODE.SUB);
			}
			else if ( aux[0].equalsIgnoreCase("out")) {
				return new ByteCode(ENUM_BYTECODE.OUT);
			}
			else if(aux[0].equalsIgnoreCase("halt")) {
				return new ByteCode(ENUM_BYTECODE.HALT);
			}
			 
		case 2:
			if(aux[0].equalsIgnoreCase("push")) {
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(aux[1]));
			}
			else if(aux[0].equalsIgnoreCase("load")) {
				return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(aux[1]));
			}
			else if(aux[0].equalsIgnoreCase("store")) {
				return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(aux[1]));
			}
		default: 
			return null;
		}

	}

}
// recibe un string y hace un split hay q identificar con if else return add, return push, etc