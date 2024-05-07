package main;

public class Main {

	/**
	 * @param args
	 * @author Mayra
	 */
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		OperandStack pruebas = new OperandStack();
        Memory pruebas1 = new Memory();
        ByteCodeParser p = new ByteCodeParser();
        CPU cpu = new CPU();
        ENUM_BYTECODE ADD = null;
        ByteCode code = new ByteCode(ADD);
        ByteCodeParser code1 = new ByteCodeParser();
        
       code1.parse("ADD");
      
        
        
        
		
		pruebas1.write(1, 2);
		pruebas1.write(2, 3);
		pruebas1.write(3, 4);
		
		pruebas.push(1);
		pruebas.push(2);
		pruebas.push(3);
		cpu.load(3);
		cpu.load(4);
		cpu.store(4);
		cpu.push(3);
		cpu.push(4);
		
		
		



	
		
		//System.out.println(cpu.push(4));
		System.out.println(pruebas.tooString());
		System.out.println(pruebas1.tooString());
		System.out.println(code1.parse("PUSH"));
		
	

	}

}
