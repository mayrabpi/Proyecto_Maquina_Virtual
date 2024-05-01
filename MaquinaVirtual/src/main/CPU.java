package main;

/**
 * 
 * 
 */
public class CPU {
	private OperandStack pila;
	private Memory memoria;
	private boolean halt;
	
	/**
	 * constructora
	 */
	public CPU() {
		this.memoria =new Memory();
		this.pila= new OperandStack();
		this.halt = false;
		
	}
	public String toString() {
		return memoria.toString() + " " + pila.tooString();
	}
	
	public boolean execute (ByteCode bc) {
		return true;
	}
	
	public boolean push(int number) {
		this.pila.push(number);
		return true;
		
	}
	/**
	 * metodo suma la cima y subcima 
	 * @return
	 */
	public boolean add() {
		boolean exito = false;
		if(this.pila.getCima()>1) {
			int cima = pila.pop();
			int subCima = pila.pop();
			push(subCima + cima);
			exito = true;
		}
		return exito;
	}
	
	public boolean sub() {
		boolean exito =false;
		if(this.pila.getCima()>1) {
			int cima = pila.pop();
			int subCima = pila.pop();
			push(subCima - cima);
			exito = true;
		}
		return exito;
	}
	
	public boolean mul(){
		boolean exito = false;
		if(this.pila.getCima()>1) {
			int cima = pila.pop();
			int subCima=pila.pop();
			push(cima*subCima);
			exito = true;
		}
		return exito;
	}
	
	public boolean div() {
		boolean exito = false;
		if(this.pila.getCima()>1) {
			int cima = pila.pop();
			int subCima=pila.pop();
			push(cima/subCima);
			exito = true;
		}
		return exito;
	}

}
//erase resetea el array de operandStack 
//metodo cpu erase limpia la memoria y la pila 
//metodo run cpu pone el atributo salir a false si es true esta parada 
//execute hace una distincion de cas0s si es suma se llama a sumapila , etc 