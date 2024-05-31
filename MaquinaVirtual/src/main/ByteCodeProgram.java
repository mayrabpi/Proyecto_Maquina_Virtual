package main;
/**
 * clase que representa el programa actual 
 */
public class ByteCodeProgram {
	private ByteCode[] program; 
	private int num_elem;
	private int size;
	
	public ByteCodeProgram() {
		this.program = new ByteCode[this.size];
		this.num_elem=0;
		this.size=10;
	}
	
	public void resize() {
			ByteCode newProgram[] = new ByteCode[this.size*2];
			for (int i=0; i<this.program.length; i++) {
					newProgram[i]=this.program[i];
					
			}
			this.program= newProgram;
			
		
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
	 * 
	 */
	public String toString() {
		 String cadena = " Programa almacenado: \n ";
		 for(int i =0; i<this.num_elem; i++) {	
		  cadena +=i +  ": "+ this.program[i].getBytecode()+" "+ this.program[i].getParam()+ "\n ";
	}
		return cadena;
	}
		
	/**
	 * 
	 * @param bc
	 * @param pos
	 * @return
	 */
	public boolean setInstruccionPosicion(ByteCode bc, int pos) {
		
		if(pos>=0 && pos < this.size) {
		
			this.program[pos]= bc;
			return true;
		}else
			return false;
	}
	/**
	 * 
	 */
	public void reset() {
		 this.program = new ByteCode[this.size];
		 this.num_elem = 0;
		  
	}
	
	/**
	 * Este metodo recorre el array y ejecuta todas las instrucciones 
	 */
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for(int i=0; i <this.num_elem; i++) {
			if(!cpu.isHalt()&& cpu.execute(this.program[i])) {
		
			         mensaje+=" El estado de la máquina tras ejecutar "+ this.program[i].getBytecode()+ " " + this.program[i].getParam()+ " \n " + cpu.toString()+" \n " ;
			         
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
