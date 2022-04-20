package br.com.cod3r.cm.modelo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.cod3r.com.modelo.Campo;

public class CampoTeste {
	
	private Campo campo = new Campo(3, 3);
	
	@Test
	void testeVizinhoRealDistancia1() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
	
		assertTrue(resultado);
	}

}
