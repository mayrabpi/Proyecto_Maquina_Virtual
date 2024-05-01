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
        CPU prueba4 = new CPU();
		
		pruebas1.write(1, 2);
		pruebas1.write(2, 3);
		pruebas1.write(3, 4);
		
		pruebas.push(1);
		pruebas.push(2);
		pruebas.push(3);
		



	
		
		System.out.println(p.parse("ADD"));
		System.out.println(pruebas.tooString());
		System.out.println(pruebas1.tooString());
		System.out.println(prueba4.toString());
		
	

	}

}
