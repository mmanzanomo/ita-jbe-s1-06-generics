package n1Exercici2;

public class GenericMethods {
	
	/* This method receives three generic arguments and prints them by console.
	 * The type parameter's scope is limited to the own method 
	 * */
	public <T, U, V> void generic(T arg1, U arg2, V arg3) {
		System.out.println("arg 1: " + arg1);
		System.out.println("arg 2: " + arg2);
		System.out.println("arg 3: " + arg3);
	}

	
}

