package main;
/**
 * clase que representa el programa actual 
 */
public class ByteCodeProgram {
	private ByteCode[] program; 
	private int num_elem;
	private int size;
	/**
	 * constructora
	 */
	public ByteCodeProgram() {
		this.program = new ByteCode[this.size];
		this.num_elem=0;
		this.size=4;
	}
	
	/**
	 * metodo que aumenta el tamaño del programa program[]
	 */
	public void resize() {
			ByteCode newProgram[] = new ByteCode[this.size*2];
			for (int i=0; i<this.program.length; i++) {
					newProgram[i]=this.program[i];
					
			}
			this.program= newProgram;
			this.size = newProgram.length;
			
		
	}
	/**
	 * Este metodo inserta un byteCode en la siguiente posicion
	 * @param instruccion
	 * @return
	 */
	public boolean setInstruccion(ByteCode instruccion) {
		//System.out.println(this.program.length);
		resize();
		if (this.num_elem<this.size) {
			
			this.program[this.num_elem]= instruccion;
			this.num_elem++;
			return true;
		}else 
			return false;
	}
	
	/**
	 * metodo que devuelve el programa almacenado 
	 * @return cadena con el programa almacenado 
	 */
	public String toString() {
		 String cadena = " Programa almacenado: \n ";
		 for(int i =0; i<this.num_elem; i++) {	
		  cadena +=i +  ": "+ this.program[i].getBytecode()+" "+ this.program[i].getParam()+ "\n ";
	}
		return cadena;
	}
		
	/**
	 * añade al programa nuevas instrucciones de tipo bytecode en una posicion especifica para los bytecode push, load, store
	 * @param bc byteccode que se añade al programa 
	 * @param pos
	 * @return true si se a podido añadir o false si no se ha podido 
	 */
	public boolean setInstruccionPosicion(ByteCode bc, int pos) {	
		resize();
		if(pos>=0 && pos < this.size) {
		
			this.program[pos]= bc;
			return true;
		}else
			return false;
	}
	/**
	 * metodo que resetea el programa 
	 */
	public void reset() {
		 this.program = new ByteCode[this.size];
		 this.num_elem = 0;
		  
	}
	
	
	/**
	 * metodo que ejecuta los bytecodes 
	 * @param cpu objeto de la clase cpu sirve para ejecutar el programa y saber el estado de la maquina
	 * @return devuelve la cadena de string especificando todo el proceso de ejecucion del programa
	 */
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for(int i=0; i <this.num_elem; i++) {
			if(!cpu.isHalt()&& cpu.execute(this.program[i])) {
			         mensaje+=" El estado de la máquina tras ejecutar "+ this.program[i].getBytecode()+ " " + this.program[i].getParam()+ " es: "+" \n " + cpu.toString()+" \n " ;
			         
			}else if (!cpu.isHalt()) {
				mensaje += "Error: ejecución incorrecta del comando";
			}
			
		}
		cpu.erase();
	    cpu.runCpu();
	    return mensaje;
		  
	}
	
	//num_elem
	//size
	//metodo runProgram recorre el array los hasta num_elems -1 devuelve un string this.program[i].tooString(); concatena un string gigante recibe la cpu
	//string runProgram(CPU cpu) pagina 4 el enunciado "el estado de la maquina ...contruye el string hace concatenacion de todo
	//programa almacenado es  metodo el tooString de esta clase this.program[i].toString();
	//metodo reset  elmina los elementos del array, this.program=new array;
	//tiene un metodo setInstruccion() añada bc al array 
	//metodo tostring "programa almacenado

}
