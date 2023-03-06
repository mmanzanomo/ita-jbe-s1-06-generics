package n2exercici1;

public class GenericMethods {
	
	// This method receives two generic arguments and a primitive type. 
	public <T, U> void generic(T arg1, U arg2, int arg3) {
		System.out.println("arg 1: " + arg1);
		System.out.println("arg 2: " + arg2);
		System.out.println("arg 3: " + arg3);
	}

	
}
