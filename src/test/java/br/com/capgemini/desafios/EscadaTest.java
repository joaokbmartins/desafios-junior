package br.com.capgemini.desafios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EscadaTest {

	Escada escada = new Escada();

	@Test
	@ParameterizedTest
	@ValueSource(ints = { 6 })
	public void exibirEscada(int qtdDegraus) {
	}

}
