package main;

public class Main {

	/**
	 * @param args
	 * @author Mayra
	 */
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		OperandStack pruebas = new OperandStack();
		OperandStack pruebas1 = new OperandStack();
		OperandStack pruebas2 = new OperandStack();
		Memory pruebas3 = new Memory();
		
		pruebas3.write(1, 2);
		pruebas3.write(2, 3);
		pruebas3.write(3, 4);
		pruebas3.write(10, 6);
		pruebas3.write(5, 31);
		pruebas3.write(1, 8);
		pruebas3.write(56, 7);
		pruebas.push(1);
		pruebas.push(2);
		pruebas.push(3);
	
		

	
		
		System.out.println(pruebas.toString());
		//System.out.println(pruebas3.read(3));
		
	

	}

}
