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
	
	/**
	 * @return el estado de la cpu, el estadado de la memoria y la pila
	 */
	public String toString() {
		 
		return "Estado de la CPU: " + "\n "+ this.memoria.toString() + "\n " + this.pila.toString();
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
	 * @return true si se puede hacer la operacion , o false si no se puede 
	 */
	public boolean sumaPila() {
		if( this.pila.isEmpty()==false) {
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
	 * @return true si la pila esta llena retorna la cima. o false si no hay elementos en la pila
	 */
	public boolean out() {
		if(this.pila.isEmpty()== false) {
			System.out.println("El elemento de la cima de la pila es: " + this.pila.getCima());
			return true;
		}else
			return false;
	
		
	}
	/**
	 * metodo resta pila
	 * @return true si se puede hacer la operacion , o false si no se puede 
	 */
	public boolean restaPila() {
		if(this.pila.isEmpty()==false ) {
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
	 * @return true si se puede hacer la operacion , o false si no se puede 
	 */
	public boolean multiplicaPila(){
		if(this.pila.isEmpty()==false ) {
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
	 * @return true si se puede hacer la operacion , o false si no se puede 
	 */
	public boolean dividePila() {
		if(this.pila.isEmpty()==false) {
			int cima = pila.pop();
			int subCima=pila.pop();
			if(cima==0|| subCima==0) {
				return false;
			}
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
	
	/**
	 * añade un  elemento a la pila
	 * @param n elemento de tipo entero 
	 * @return true si se ha añadido 
	 */
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
	 * metodo que para la maquina 
	 * @return true si la maquina esta parada 
	 */
	public boolean isHalt() {
		 this.halt= true;
		 return true;
	}
	
	/**metodo stopcpu
	 * 
	 * @return
	 */
	public boolean stopCpu() {
		return this.halt=true;
	}
	
	/**
	 * metodo que pone en march la maquina 
	 * @return si la maquina no esta parada
	 */
	public boolean runCpu() {
		return this.halt = false;
	}
	
	
		
}
	


//erase resetea el array de operandStack 
//metodo cpu erase limpia la memoria y la pila 
//metodo run cpu pone el atributo salir a false si es true esta parada 
//execute hace una distincion de cas0s si es suma se llama a sumapila , etc 