package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import banco.Conta1;

class ContaTest {
	private Conta1 c;

	@BeforeEach
	public void init() {
		c = new Conta1(123, "Raquel", "000000000-99");
	}

	@Test
	@DisplayName("Teste do construtor")
	public void construtorTest() {
		assertEquals(0.0, c.getSaldo(), 0.005);
		assertEquals("Raquel", c.getNomeTitular());
		assertEquals("000000000-99", c.getCPFTitular());
		assertEquals(123, c.getNumero());
	}

	@Test
	@DisplayName("Teste depositar valor zero")
	public void depositarTest1() {
		c.depositar(0.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste depositar valor negativo")
	public void depositarTest2() {
		c.depositar(-0.01);
		assertEquals(0.0, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste depositar valor positivo")
	public void depositarTest3() {
		c.depositar(0.01);
		assertEquals(0.01, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste sacar sem saldo")
	public void sacarTest1() {
		c.sacar(100.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste sacar tudo")
	public void sacarTest2() {
		c.depositar(100.0);
		c.sacar(100.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste sacar valor ok")
	public void sacarTest3() {
		c.depositar(100.0);
		c.sacar(99.9);
		assertEquals(0.1, c.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste transferir sem saldo")
	public void transferirTest1() {
		Conta1 outra = new Conta1(123, "Livia", "000000001-99");
		c.transferir(outra, 10.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
		assertEquals(0.0, outra.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste transferir valor zero")
	public void transferirTest2() {
		Conta1 outra = new Conta1(123, "Livia", "000000001-99");
		c.transferir(outra, 0.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
		assertEquals(0.0, outra.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Teste transferir valor ok")
	public void transferirTest3() {
		c.depositar(100.0);
		Conta1 outra = new Conta1(123, "Livia", "000000001-99");
		c.transferir(outra, 10.0);
		assertEquals(90.0, c.getSaldo(), 0.005);
		assertEquals(10.0, outra.getSaldo(), 0.005);
	}
	
	@Test
	@DisplayName("Teste transferir valor negativo")
	public void transferirTest4() {
		Conta1 outra = new Conta1(123, "Livia", "000000001-99");
		c.transferir(outra, -20.0);
		assertEquals(0.0, c.getSaldo(), 0.005);
		assertEquals(0.0, outra.getSaldo(), 0.005);
	}
}
