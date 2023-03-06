package n1Exercici1;


public class NoGenericMethods {
	
	private String string1;
	private String string2;
	private String string3;
	
	// All methods are of the same type. Therefore, the order of the arguments does not matter
	public NoGenericMethods(String string1, String string2, String string3) {
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}

	public void setString3(String string3) {
		this.string3 = string3;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NoGenericMethods [string1 = ").append(string1);
		builder.append(", string2 = ").append(string2);
		builder.append(", string3 = ").append(string3);
		builder.append("]");
		return builder.toString();
	}
	
}
