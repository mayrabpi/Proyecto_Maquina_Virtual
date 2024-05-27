package main;

public class CommandParser {
	
	public CommandParser() {
		
	}
	/**
	 * Metodo que se encarga de analizar el parametro line y generar apartir de el, el correspondiente comando
	 * @param line si no se corresponde con la sintaxis de ningun comando devuelve null
	 * @return line o null si line no corrsponde con la sintaxis de ningun comando
	 */
	public static Command parse(String line) {
		String[] aux = line.split(" ");
		switch ( aux.length) {
		case 1 : {
			if(aux[0].equalsIgnoreCase("help"))
				return new Command(ENUM_COMMAND.HELP);
			
			else if(aux[0].equalsIgnoreCase("quit"))
				return new Command(ENUM_COMMAND.QUIT);
			
			else if(aux[0].equalsIgnoreCase("run"))
				return new Command(ENUM_COMMAND.RUN);
			
			else if(aux[0].equalsIgnoreCase("reset"))
				return new Command(ENUM_COMMAND.RESET);
			
		}
		case 2 :{
			if(aux[0].equalsIgnoreCase("replace"))
				return new Command(ENUM_COMMAND.REPLACE, Integer.parseInt(aux[1]));
			
			else if (aux[0].equalsIgnoreCase("newinst"))
				return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(aux[1]));
			
		}
		case 3 :{
			if(aux[0].equalsIgnoreCase("newinst"))
				return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(aux[1]+ " "+ aux[2]));
			
		}default:
			return null;
		}
	}

}
