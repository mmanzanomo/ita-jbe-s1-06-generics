package n1Exercici2;

public class Main {

	public static void main(String[] args) {
		GenericMethods genericMethod = new GenericMethods();
		
		/* It receives as arguments a String, a Person Object and a primitive type
		 * and prints them by console 
		 */
		genericMethod.generic("Comment", new Persona("Lucas", "Castillo", (byte) 25), 30);
		
		System.out.println();
		
		/* The params can be received in any order */
		genericMethod.generic(new Persona("Lucas", "Castillo", (byte) 25), 35, "Comment");
		
	}

}
