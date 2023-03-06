package n3exercici1;

public class Smartphone implements ITelefon {

	@Override
	public void trucar() {
		System.out.println("S'està realitzant una trucada");
	}
	
	public void ferFotos() {
		System.out.println("S'ha fet una foto.");
	}

}
