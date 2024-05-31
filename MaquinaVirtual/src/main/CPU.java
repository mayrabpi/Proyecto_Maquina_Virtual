package main;

/**
 * Es la unidad de precesamiento de la maquina virtual, contiene una memoria y una pila de operandos 
 * 
 */
public class CPU  {
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
	public String toString() {
		 
		return ("Estado de la CPU: " + "\n "+ this.memoria.toString() + "\n " + this.pila.toString());
	}
	
	/**
	 * lee de la memoria el valor almacenado en pos y lo apila en la pila 
	 * @param pos es la posicion del elemento de la memoria
	 * @return 
	 */
	public boolean load(int pos) {
		if(this.memoria.read(pos)!=-1) {
			this.pila.push(this.memoria.read(pos));
			return true;
		}else
			return false;
	}
	/**
	 * añade a la memoria la cima de la pila  
	 * @param pos de la memoria en la que se quiere añadir
	 * @return
	 */
	public boolean store(int pos) {
		
		if(this.pila.getCima()!=-1) {
			int cima = pila.pop();
			this.memoria.write(pos, cima);
			return true;
		}else
		   return false;
	}
	/**
	 * metodo suma la cima y subcima 
	 * @return
	 */
	public boolean sumaPila() {
		if( this.pila.getNumElem()>1) {
			int cima = pila.pop();
			int subCima = pila.pop();
			int resultado=subCima + cima;
			this.pila.push(resultado);
			return true;
		}else
		   return false;
	}
	/**
	 * escribe el entero almacenado en la cima de la pila
	 * @return
	 */
	public boolean out() {
		if(!this.pila.isEmpty()&& this.pila.getNumElem()>0) {
			System.out.println("El elemento de la cima de la pila es: " + this.pila.getCima());
			return true;
		}else
			return false;
	
		
	}
	/**
	 * metodo resta pila
	 * @return
	 */
	public boolean restaPila() {
		if(this.pila.getNumElem()>1 ) {
			int cima = pila.pop();
			int subCima = pila.pop();
			int resultado=subCima - cima;
		    this.pila.push(resultado);
			return true;
		}else
		 return false;
	}
	/**
	 * metodo multiplica la pila
	 * @return
	 */
	public boolean multiplicaPila(){
		if(this.pila.getNumElem()>1 ) {
			int cima = pila.pop();
			int subCima=pila.pop();
			int resultado=cima*subCima;
			this.pila.push(resultado);
			return true;
		}else
		return false;
	}
	/**
	 * metodo divide pila
	 * @return
	 */
	public boolean dividePila() {
		if(this.pila.getNumElem()>1) {
			int cima = pila.pop();
			int subCima=pila.pop();
			int resultado =cima/subCima;
			this.pila.push(resultado);
			return true;
		}else
		return false;
	}
	/**
	 * Metodo encargado de ejecutar la instruccion  que le llega como parametro modificando convenientemente la  memoria y la pila
	 * @param instruccion
	 * @return si la ejecucion tiene exito retorna instruccion, si genera un erros devuelve false
	 */
	public boolean execute (ByteCode instruccion) {
	
		switch(instruccion.getBytecode()) {
		case ADD:
			return sumaPila();
			
		case SUB:
			return restaPila();
		
		case MUL:
			return multiplicaPila();
		
		case DIV:
			return dividePila();
			
		case OUT:
			return out();
		
		case HALT:
			return halt;
	
		case LOAD:
			return load(instruccion.getParam());
			
		case STORE:
			return store(instruccion.getParam());
			
		case PUSH:
			return push(instruccion.getParam());
		default:
			return false;	
		}
		
		}
	
	public boolean push(int n) {
		this.pila.push(n);
		return true;
	}

	
	
	/**
	 * este metodo vacia la memoria y la pila 
	 */
	public void erase() {
		this.memoria= new Memory();
		this.pila = new OperandStack();
	}
	
	/**
	 * metodo que indica si la maquina esta parada o no
	 * @return
	 */
	public boolean isHalt() {
		return this.halt;
	}
	
	public boolean stopCpu() {
		return this.halt=true;
	}
	public boolean runCpu() {
		return this.halt = false;
	}
	
	
		
}
	


//erase resetea el array de operandStack 
//metodo cpu erase limpia la memoria y la pila 
//metodo run cpu pone el atributo salir a false si es true esta parada 
//execute hace una distincion de cas0s si es suma se llama a sumapila , etc 