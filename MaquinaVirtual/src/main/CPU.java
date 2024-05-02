package main;

/**
 * Es la unidad de precesamiento de la maquina virtual, contiene una memoria y una pila de operandos 
 * 
 */
public class CPU {
	private OperandStack pila;
	private Memory memoria;
	private boolean halt; //determina cuando termina la ejecucion 
	
	/**
	 * constructora
	 */
	public CPU() {
		this.memoria =new Memory();
		this.pila= new OperandStack();
		this.halt = false;
		
	}
	public String tooString() {
		return memoria.toString() + " " + pila.tooString();
	}
	/**
	 * apila en la pila de operandos el entero number
	 * @param number
	 * @return
	 */
	public boolean push(int number) {
		this.pila.push(number);
		return true;
		
	}
	/**
	 * lee de la memoria el valor almacenado en pos y lo apila en la pila 
	 * @param pos
	 * @return
	 */
	public boolean load(int pos) {
		boolean exito = false;
		if(pos>=0) {
			this.pila.push(this.memoria.read(pos));
			exito = true;
		}
		return exito;
		
	}
	
	public boolean store(int pos) {
		boolean exito=false;
		if(this.pila.getCima()>0 && pos >=0) {
			int cima = pila.pop();
			this.memoria.write(pos, cima);
			exito= true;
		}
		return exito;
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
	/**
	 * escribe el entero almacenado en la cima de la pila
	 * @return
	 */
	public boolean out() {
		boolean exito = false;
		if(this.pila.getCima()> 0) 
			exito = true;
			else 
				exito= false;
		
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
	/**
	 * Metodo encargado de ejecutar la instruccion  que le llega como parametro modificando convenientemente la  memoria y la pila
	 * @param instruccion
	 * @return si la ejecucion tiene exito retorna instruccion, si genera un erros devuelve false
	 */
	public boolean execute (ByteCode instruccion) {
		boolean exito =false;
		switch(instruccion.getBytecode()) {
		case ADD:
			exito = add();
			break;
		case SUB:
			exito = sub();
			break;
		case MUL:
			exito = mul();
			break;
		case DIV:
			exito = div();
			break;
		default:
			exito = false;		
		}
		return exito;
	}
	/**
	 * metodi que indica a la cpu que ya queremo salir
	 */
	public void run() {
		this.halt= true;
	}

}
//erase resetea el array de operandStack 
//metodo cpu erase limpia la memoria y la pila 
//metodo run cpu pone el atributo salir a false si es true esta parada 
//execute hace una distincion de cas0s si es suma se llama a sumapila , etc 