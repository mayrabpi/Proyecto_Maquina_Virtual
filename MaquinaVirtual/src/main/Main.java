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
        
        ByteCode code = new ByteCode(ENUM_BYTECODE.ADD);
        ByteCodeParser code1 = new ByteCodeParser();
        
       code1.parse("add");
      
        
        
        
		
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
		cpu.execute(code);
		
	
		
		
		
		



	
		
		//System.out.println(cpu.push(4));
		System.out.println(pruebas.toString());
		System.out.println(pruebas1.toString());
		System.out.println(pruebas.pop());
		System.out.println(pruebas1.read(1));
		
		
	

	}

}
