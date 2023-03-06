package n2exercici2;

import n1Exercici2.Persona;

public class Main {

	public static void main(String[] args) {
		GenericMethods genericMethod = new GenericMethods();
		
		// Calls the generic method with any number of arguments of any type. 
		genericMethod.generic("Comment", new Persona("Lucas", "Castillo", (byte) 25), 30, "a message");
		
	}

}
