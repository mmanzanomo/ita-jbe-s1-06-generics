package n2exercici2;

public class GenericMethods {
	
	// This method receives any number of arguments of any type. 
	public <T> void generic(T... args) {
		int pos = 1;
		
		for(T arg: args) {
			System.out.println("arg " + pos + ": " + arg);
			pos++;
		}
	}

}
