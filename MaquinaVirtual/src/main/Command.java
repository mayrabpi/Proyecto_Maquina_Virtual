package main;
/**
 * clase que representa los distintos comandos que puede utilizar un usuario, para representar el comando necesitamos los siguientes atributos:
 */
public class Command {
	private ENUM_COMMAND comand;
	private ByteCode instruccion;//toma valor haciendo referencia a NEWINST
	private int replace;//toma valor haciendo haciendo referencia a REPLACE
	/**
	 * costructor 1
	 */
	public Command(ENUM_COMMAND comando) {
		this.comand = comando;
		
	}
	
	/**
	 * contructora 2 
	 * @param comando comando HELP, QUIT, NEWINST, RUN, RESET, 
	 * @param instruccion bytecode  PUSH, LOAD, STORE, ADD, SUB, MUL, OUT, HALT
	 */
	public Command (ENUM_COMMAND comando, ByteCode instruccion) {
		this.comand=comando;
		this.instruccion=instruccion;
		
	}
	
	/**
	 * contructora 3
	 * @param comando comando
	 * @param replace hace referencia al comando REPLECE
	 */
	public Command (ENUM_COMMAND comando, int replace) {
		this.comand=comando;
		this.replace=replace;
	}
	
	/**
	 * metodo encargado de ejecutar el comando, dando la orden correspondiente a engine
	 * si el comando es incorrecto el metodo devuelve false , en otro caso devuelve true
	 * @param engine
	 * @return el comando , si el comando no es correcto retorna false
	 */
	public boolean excute ( Engine engine) {
		switch(this.comand) {
		case HELP:
			return engine.commandHelp();
		case QUIT:
			return engine.commandQuit();
		case RUN:
			return engine.commandRun();
		case NEWINST:
			return engine.commandNewIns(this.instruccion);
		case RESET:
			return engine.commandReset();
		case REPLACE:
			return engine.commandReplace(this.replace);
		default:
			return false;
		}
	}
	public ENUM_COMMAND getCommand() {
		return this.comand;
	}
	

			
		
	

}
//tiene 3 atributos 
// comand de tipo enum comand
// instruccion de tipo bytecode , tomara valor cuando se utilize del comando NEWINST 
//int replace por q hay un comando replace n, este atributo toma el valor que de el usuario
//tiene 3 constructoras una recibira un enum y un bytecode
//otra contructora reciba el enum y reciba el int 
//
//tiene solo un metodo execute booleano , recibe un engin tiene un if else con todos los comando disponibles, ejem si el comando es replace le dice a engine que ejecute el comando engine
//engine.replace
//execute(engine eng)
//if(this.command = =ENUM_COMAND.REPLACE)
//return true;
//engine.replace(this.replace);
//else if (this.command )
//engine.newInst(this.intruccion)

