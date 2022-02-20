package br.com.capgemini.desafios;

public class ValidadorSenha {

	static final int LENGTH = 6;

	public static void validarSenha(String senha) {
		String regexNumber = ".*[0-9].*";
		String regexLowercase = ".*[a-z].*";
		String regexUppercase = ".*[A-Z].*";
		String regexSpecialCharacter = ".*[!@#$%^&*()-+].*";
		String regexInvalidCharacter = ".*[^a-zA-Z0-9!@#$%^&*()-+].*";

		System.err.print("Senha: " + senha + " ");
		if (senha.length() < LENGTH) {
			int qtd = LENGTH - senha.length();
			System.out.println("A senha deve conter 6 caracteres. Quantidade atual: " + qtd);
		} else if (!senha.matches(regexNumber)) {
			System.out.println("A senha deve conter um dígito numérico.");
		} else if (!senha.matches(regexLowercase)) {
			System.out.println("A senha deve conter um caractere minúsculo.");
		} else if (!senha.matches(regexUppercase)) {
			System.out.println("A senha deve conter um caractere maiúsculo.");
		} else if (!senha.matches(regexSpecialCharacter)) {
			System.out.println("A senha deve conter um dos seguintes caracteres especiais \"!@#$%^&*()-+\".");
		} else if (senha.matches(regexInvalidCharacter)) {
			System.out.println("A senha pode conter apenas letras, números e os seguintes caractéres: \"!@#$%^&*()-+\".");
		} else {
			System.out.println("Senha válida!");
		}
	}

	public static void main(String[] args) {
		validarSenha("asa1$5");
		validarSenha("AAAA$5");
		validarSenha("aSaa$a");
		validarSenha("");
		validarSenha("aSa135");
		validarSenha("aSa1$5dsad~sd");
		validarSenha("aSa1");
		validarSenha("aSa1$5");
		validarSenha("aSa1$5dsadsd");
	}
}
