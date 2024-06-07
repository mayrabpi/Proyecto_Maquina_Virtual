package main;
import java.util.Scanner;
/**
 * Representa el bucle de control de la aplicacion 
 */
public class Engine {
	private ByteCodeProgram program;//representa el programa actual
	private boolean end;//representa la terminacion de la aplicacion
	private CPU cpu;
	private Scanner entrada;
	
	public Engine(){
		this.program= new ByteCodeProgram();
		this.end= false;
		this.cpu = new CPU();
		this.entrada = new Scanner(System.in);
	}
	/**
	 * metodo que se encarga de leer sucesivamente los comandos introducidos por el usuario
	 * hasta recibir el comando QUIT
	 */
	public void start() {
		String entrada1="";
		while(!this.end){
			entrada1= this.entrada.nextLine();
			Command comand= CommandParser.parse(entrada1);
			
			if(comand !=null) {
				System.out.println(" Comienza la ejecución de "+ entrada1.toUpperCase());
				if(!comand.excute(this)) {
					System.out.println(" Error: Ejecución incorrecta del comando");
				}
			}else {
				System.out.println(" Error: comando incorrecto");
			}

			
		}
	}
	
	/**
	 *  en el que el usuario mete va introsuciendo las instrucciones del programa 
	 * @param bc bc bytecode 
	 * @return true si se ha introducido correctamente 
	 */
	public boolean commandNewIns(ByteCode bc) {
			this.program.setInstruccion(bc);
			System.out.println(this.program.toString());
			return true;
		
	}
	
	/**
	 * comando  que vacia el programa
	 * @return true si  se ha ejecutado correctamente 
	 */
	public boolean commandReset() {
		this.program.reset();
		System.out.println(this.program.toString());
		return true;
	}
	
	/**
	 * comando que remplaza una instruccion por otra 
	 * @param n 
	 * @return true si  se ha ejecutado correctamente 
	 */
	public boolean commandReplace(int n) {
		System.out.println(" Nueva instrucción: ");
		String entrada1 = this.entrada.nextLine().toUpperCase();
		ByteCode bc= ByteCodeParser.parse(entrada1);
		this.program.setInstruccionPosicion(bc, n);
		System.out.println(this.program.toString());
		return true;
	}
	
	/**
	 * comando que ejecuta las instrucciones que el usuario introduce 
	 * @return true si  se ha ejecutado correctamente 
	 */
	public boolean commandRun() {
		System.out.println(this.program.runProgram(this.cpu));
		System.out.println(this.program.toString());
		
		return true;
	}
	
	/**
	 * comando que finaliza el programa
	 * @return true si  se ha ejecutado correctamente 
	 */
	public boolean commandQuit() {
		System.out.println(this.program.toString());
		System.out.println(" Fin de la ejecución....");
		
		return this.end= true;
	}
	
	/**
	 * comando que muestra el menu con las funcionalidades del programa
	 * @return true si  se ha ejecutado correctamente 
	 */
	public boolean commandHelp() {
		//System.out.println("Comienza la ejecución de HELP");
		System.out.println("HELP: Muestra esta ayuda");
		System.out.println("QUIT: Cierra la aplicación");
		System.out.println("RUN: Ejecuta el programa");
		System.out.println("NEWINST BYTECODE: Introduce una nueva instrucción al progrma");
		System.out.println("RESET: Vacia el programa actual");
		System.out.println("REPLACE N: Reemplaza la instrucción N por la solicitada al usuario");
		return true;
	}
	
	
	
	

}
//private ByteCodeProgram program; new bytecode program
	//private boolean fin; constructora a false
	
//atributo de tipo cpu new cpu 
//atributo Scanner 
//metodo void start entra en un bucle while(!this.fin) recoge lo que se introduze por pantalla ejem usuario introduce un comando llamamos al commandParser
//entrada = scn.nexline();
//creamos un objeto de tipo command Command co = commandParser.parse(entrada) (metodo Parse es estatico)
//system ("comienza la ejecucion de : hELP) QUE HELP ES EL NOMBRE DEL COMANDO 	que lo da el metodo parse
//si co es !null entonces si el comando no se ha ejecutado correctamente 
//if(co!=null) sytem("error: comando incorrecto"  (" dento if(!co.execute(this)) system("error: ejecucion incorrecta del comando" )
//metodo commandHelp() imprime por pantalla el listado de de comandos con la ayuda 
//metodo commandReset()usuario introduce reset, Llamma a this.program.reset();
//metodo commandNewIns(ByteCode bc) añadir un byteCode al programa this.program.setInstruccion(bc); 
//metodo commandRun()
