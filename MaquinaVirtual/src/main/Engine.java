package main;
import java.util.Scanner;
/**
 * Representa el bucle de control de la aplicacion 
 */
public class Engine {
	private ByteCodeProgram program;//representa el programa actual
	private boolean end;//representa la terminacion de la aplicacion
	private CPU n;
	private Scanner entrada;
	
	public Engine(){
		this.program= new ByteCodeProgram();
		this.end= false;
		this.n = new CPU();
		this.entrada = new Scanner(System.in);
	}
	/**
	 * metodo que se encarga de leer sucesivamente los comandos introducidos por el usuario
	 * hasta recibir el comando QUIT
	 */
	public void start() {
		//Command co = new Command();
		while(!this.end) {
			
		}
	}
	public void commandNewIns(ByteCode bc) {
		System.out.println("Comienza la ejecución de NEWINST");
		this.program.setInstruccion(bc);
	}
	public void commandReset() {
		System.out.println("Comienza la ejecución de NEWINST");
		this.program.reset();
	}
	public void commandHelp() {
		System.out.println("Comienza la ejecución de HELP");
		System.out.println("HELP: Muestra esta ayuda");
		System.out.println("QUIT: Cierra la aplicación");
		System.out.println("NEWINST");
		System.out.println("RESET");
		System.out.println("REPLACE");
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
