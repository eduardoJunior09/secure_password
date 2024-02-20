package secure_password;

public class Verification {

	private String password;
	private boolean numberChar = false, uppercase = false, lowercase = false, number = false, caracterSpecial = false;

	public Verification() {
	
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getNumberChar() {
		return numberChar;
	}

	public void setNumberChar(boolean numberChar) {
		this.numberChar = numberChar;
	}

	public boolean getUppercase() {
		return uppercase;
	}

	public void setUppercase(boolean uppercase) {
		this.uppercase = uppercase;
	}

	public boolean getLowercase() {
		return lowercase;
	}

	public void setLowercase(boolean lowercase) {
		this.lowercase = lowercase;
	}

	public boolean getNumber() {
		return number;
	}

	public void setNumber(boolean number) {
		this.number = number;
	}

	public boolean getCaracterSpecial() {
		return caracterSpecial;
	}

	public void setCaracterSpecial(boolean caracterSpecial) {
		this.caracterSpecial = caracterSpecial;
	}

	
	// Metódos
	
	public void passwordVerification() {

		if (this.password.length() >= 8) {
			this.setNumberChar(true);
		}

		this.setUppercase(upperCase()); 
		this.setLowercase(lowerCase());
		this.setNumber(numberVerification());
		this.setCaracterSpecial(caracterSpecial());

	}

	public boolean upperCase() {
		boolean letter = this.password.matches(".*[A-Z].*");

		if (letter) {

			return true;
		} else {
			return false;
		}
	}

	public boolean lowerCase() {
		boolean letter = this.password.matches(".*[a-z].*");

		if (letter) {

			return true;
		} else {
			return false;
		}
	}

	public boolean numberVerification() {

		boolean number = this.password.matches(".*\\d.*");

		if (number) {
			return true;
		} else {
			return false;
		}

	}

	public boolean caracterSpecial() {

		boolean caracterSpecial = this.password.matches(".*\\W.*");

		if (caracterSpecial) {
			return true;
		} else {
			return false; 
		}

	}

	public String toString() {
		if(this.getNumberChar() && this.getUppercase() && this.getLowercase() && this.getNumber() && this.getCaracterSpecial()) {
			return "Senha validada com sucesso!"; 
		}else {
			return "A senha não satisfaz as condições necessarias.\nPossui pelo menos 08 caracteres: " + this.getNumberChar() 
			+ "\nContém pelo menos uma letra maiúscula: " + this.getUppercase() + 
			"\nContém pelo menos uma letra minúscula: " + this.getLowercase() + "\nContém pelo menos um dígito numérico: " + this.getNumber() +
			"\nVerificar se a senha contém pelo menos um caractere especial: " + this.getCaracterSpecial();
		}
	}

}
