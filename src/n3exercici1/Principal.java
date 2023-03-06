package n3exercici1;

public class Principal {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		Generica generica = new Generica();
		
		// Method that gets argument limited by the Telefon interface
		generica.genericLimitatITelefon(smartphone);
		
		System.out.println();
		
		// Method that gets argument limited by the Smartphone class
		generica.genericLimitatSmartphone(smartphone);
		
	}

}
