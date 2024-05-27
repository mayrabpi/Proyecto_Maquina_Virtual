package main;
/**
 * clase que representa el programa actual 
 */
public class ByteCodeProgram {
	private ByteCode[] program; 
	private CPU cpu =new CPU();
	private int num_elem;
	private int size;
	public ByteCodeProgram() {
		this.program = new ByteCode[this.size];
		this.num_elem=0;
		this.size=1;
	}
	
	public void resize() {
		if(this.num_elem ==this.size) {
			ByteCode newProgram[] = new ByteCode[this.size*2];
			for (int i=0; i<this.size; i++) {
				if(i<this.size)
					newProgram[i]=this.program[i];
				
				else
					newProgram[i]=null;
			}
			this.program= newProgram;
			this.size= newProgram.length;
		}
	}
	/**
	 * Este metodo inserta un byteCode en la siguiente posicion
	 * @param instruccion
	 * @return
	 */
	public void setInstruccion(ByteCode instruccion) {
		resize();
		if(this.num_elem<this.program.length) {
			this.program[this.num_elem]=instruccion;
			this.num_elem++;
			
		}
		
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
		    this.size=1;
	}
	/**
	 * 
	 */
	public String toString() {
		 String cadena = " ";
		for(int i =0; i<this.num_elem;i++) {
			if(this.program[(i+1)-1].getParam()==-1) {
				cadena+= i+ ": "+ this.program[(i+1)- 1].getBytecode()+ "\n";
			}else {
				cadena+= i +": " + this.program[i].getBytecode()+ " "+ this.program[i].getParam()+ "\n";
			}
		}
		return cadena;
	}
	/**
	 * Este metodo recorre el array y ejecuta todas las instrucciones 
	 */
	public String runProgram(CPU cpu) {
		String mensaje = " ";
		for(int i=0; i <this.num_elem; i++) {
			if(!cpu.isHalt()&& cpu.execute(this.program[i])) {
				if(this.program[i].getParam()!=-1)
			         mensaje += "\n El estado de la máquina tras ejecutar "+ this.program[i].getBytecode()+ " " + this.program[i].getParam()+ " es:\n\n CPU estado:\n" + cpu.tooString()+"\n";
				else 
					 mensaje += "\n El estado de la máquina tras ejecutar "+ this.program[i].getBytecode()+ " es:\n\nCPU estado: \n" + cpu.tooString()+ "\n";
					
			}else if (!cpu.isHalt()) {
				mensaje += "Fallo: ejecución incorrecta del comando";
			}
			
		}
		cpu.erase();
	    cpu.runCPU();
	    return mensaje;
		  
	}
	//num_elem
	//size
	//metodo runProgram recorre el array los hasta num_elems -1 devuelve un string this.program[i].tooString(); concatena un string gigante recibe la cpu
	//string runProgram(CPU cpu) pagina 4 el enunciado "el estado de la maquina ...contruye el string hace concatenacion de todo
	//programa almacenado es  metodo el tooString de esta clase this.program[i].toString();
	//metodo reset  elmina los elementos del array, this.program=new array;
	//tiene un metodo setInstruccion() añada bc al array 

}
