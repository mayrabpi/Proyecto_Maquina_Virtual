package main;
/**
 * clase que representa los distintos comandos que puede utilizar un usuario, para representar el comando necesitamos los siguientes atributos:
 */
public class Command {
	private ENUM_COMMAND comand;
	private ByteCode instruccion;//toma valor haciendo referencia a NEWINST
	private int replace;//toma valor haciendo haciendo referencia a REPLACE
	/**
	 * costructor por defecto
	 */
	public Command(ENUM_COMMAND comando) {
		this.comand = comando;
		
	}
	
	public Command (ENUM_COMMAND comando, ByteCode n) {
		this.comand=comando;
		this.instruccion=n;
		
	}
	public Command (ENUM_COMMAND comando, int replace) {
		this.comand=comando;
		this.replace=replace;
	}
	
	/**
	 * metodo encargado de ejecutar el comando, dando la orden correspondiente a engine
	 * si el comando es incorrecto el metodo devuelve false , en otro caso devuelve true
	 * @param engine
	 * @return
	 */
	public boolean execute(Engine engine) {
		if(this.comand == ENUM_COMMAND.REPLACE) {
			
		}
			
		return true;
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