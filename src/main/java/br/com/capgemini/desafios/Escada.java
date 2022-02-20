package br.com.capgemini.desafios;

public class Escada {

	public void exibirEscada(int qtdDegraus) {
		for (int i = 0; i < qtdDegraus; i++) {
			System.out.println(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}
	}

	public static void main(String[] args) {
		new Escada().exibirEscada(6);
	}
}