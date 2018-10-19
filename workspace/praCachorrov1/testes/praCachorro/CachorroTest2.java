package praCachorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CachorroTest2 {
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
	@DisplayName("testa construtor nome null")
	void testCachorro1() {
		try {
			new Cachorro(null, "SRD", 12);
			fail("deveria lancar excecao de nome null");
		} catch (NullPointerException npe) {
			assertEquals("nome nao pode ser null", npe.getMessage());
		}
	}

	@Test
	@DisplayName("testa construtor nome vazio")
	void testCachorro2() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Cachorro(" ", "SRD", 12);
		});
		//assertEquals("nome nao pode ser vazio", iae.getMessage());

	}
}









