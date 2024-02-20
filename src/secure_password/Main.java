package secure_password;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Verification password = new Verification();

		String inputValue = JOptionPane.showInputDialog("Digite sua senha: ");

		password.setPassword(inputValue);
		password.passwordVerification();

		System.out.println(password.toString());

	}

}
