package praCachorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CachorroTest {
	Cachorro auau;

	@BeforeEach
	void setUp() throws Exception {
		auau = new Cachorro("Cachorro", "vira-lata", 12);
	}

	@Test
	@DisplayName("testa contrutor cntp")
	void testCachorro() {
		assertEquals("Cachorro", auau.getNome());
		assertEquals("vira-lata", auau.getRaca());
		assertEquals(12, auau.getNumMeses());
	}

	@Test
	@DisplayName("testa contrutor nome null")
	void testCachorro1() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro(null, "vira-lata", 12);
		});
		assertEquals("nome nao pode ser null", iae.getMessage());
	}
	
	@Test
	@DisplayName("testa contrutor nome vazio")
	void testCachorro2() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro("  ", "vira-lata", 12);
		});
		assertEquals("nome nao pode ser vazio", iae.getMessage());
	}
	
	@Test
	@DisplayName("testa contrutor raca null")
	void testCachorro3() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro("Cachorro", null, 12);
		});
		assertEquals("raca nao pode ser null", iae.getMessage());
	}
	
	@Test
	@DisplayName("testa contrutor raca vazia")
	void testCachorro4() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro("Cachorro", "  ", 12);
		});
		assertEquals("raca nao pode ser vazia", iae.getMessage());
	}

	@Test
	@DisplayName("testa contrutor idade negativa")
	void testCachorro5() {
		//o metodo asstertThrows espera receber como entrada um tipo de exceção (neste caso
		//é o IllegalArgumentException e uma execução que gere a exceção. 
		//O constructo () -> define uma função sem nome e sem parametro de entrada que vai ser
		//executada. Nesse caso essa função simplesmente chama o new de Cachorro.
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro("Cachorro", "vira-lata", -12);
		});
		assertEquals("idade tem que ser positiva", iae.getMessage());
	}
	
	/*
	 * uma outra forma de testar com o try/catch/fail
	 */
	@Test
	@DisplayName("testa contrutor idade negativa com try/catch/fail")
	void testCachorro6() {
		try {
			new Cachorro("Cachorro", "vira-lata", -12);//uma exceção deve ser lançada aqui
			//essa linha abaixo nunca deve ser executada porque a exceção foi lançada e 
			//a execução pula direto para o catch. Se a linha abaixo for executada
			//é porque a exceção não foi lançada e o teste irá falhar.
			fail("Deveria ter lancado IllegalArgumentException");
		} catch(IllegalArgumentException iae) {
			assertEquals("idade tem que ser positiva", iae.getMessage());
		}
	}
}
