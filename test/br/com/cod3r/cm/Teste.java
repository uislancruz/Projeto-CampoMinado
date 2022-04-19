package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualADois() {
		
		int a = 1 + 1;
		
		assertEquals(2, a);
		//fail("Not yet implemented");
	}
	@Test
	void testarSerIgualATres() {
		
		int x = 2 + 10 - 7;
		
		assertEquals(3, x);
		
	}

}
