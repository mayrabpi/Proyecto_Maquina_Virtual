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
		this.program = new ByteCode[this.num_elem];
		this.num_elem=0;
		this.size=0;
	}
	public boolean setInstruccion(ByteCode instruccion) {
		if(this.num_elem<this.program.length) {
			this.program[this.num_elem]=instruccion;
			this.num_elem++;
			return true;
		}
		else
			return false;
		
	}
	public void reset() {
		 this.program = new ByteCode[this.size];
		    this.num_elem = 0;
	}
	public String toString() {
	
		return "Programa almacenado";
	}
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for(int i=0; i <this.num_elem; i++) {
			if(!cpu.isHalt()&& cpu.execute(this.program[i])) {
			System.out.println("El estado de la máquina tras ejecutar el byteco");
			}
			else if (!cpu.isHalt()){
			 //bla bla
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
