package n2exercici1;

import n1Exercici2.Persona;

public class Main {
	
	public static void main(String[] args) {
		GenericMethods genericMethod = new GenericMethods();
		
		// The third argument must be a primitive type.
		genericMethod.generic("Comment", new Persona("Lucas", "Castillo", (byte) 25), 30);
		
		// This method must not be run because the third argument expects a primitive type.
		// genericMethod.generic(12, new Persona("Lucas", "Castillo", (byte) 25), "Comment");
		
	}
}
