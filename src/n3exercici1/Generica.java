package n3exercici1;

public class Generica {

	/*
	 * This method gets a type limited by the phone interface
	 * that only knows the trucar() method. Therefore, this cannot 
	 * call ferFotos() method of Smartphone class.
	 */
	public <T extends ITelefon> void genericLimitatITelefon(T arg) {
		arg.trucar();
	}
	
	/*
	 * This method gets a type limited by the Smartphone class that has
	 * access to both methods.
	 */
	public <T extends Smartphone> void genericLimitatSmartphone(T arg) {
		arg.trucar();
		arg.ferFotos();
	}
	
}
