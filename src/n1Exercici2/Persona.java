package n1Exercici2;

public class Persona {
	private String nom;
	private String cognom;
	private byte edad;
	
	
	public Persona(String nom, String cognom, byte edad) {
		this.nom = nom;
		this.cognom = cognom;
		this.edad = edad;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nom=").append(nom);
		builder.append(", cognom=").append(cognom);
		builder.append(", edad=").append(edad);
		builder.append("]");
		return builder.toString();
	}


	


	


	
	
	
	
}
