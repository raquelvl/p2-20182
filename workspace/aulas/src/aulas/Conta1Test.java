package aulas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Conta1Test {
	private Conta1 conta;

	@BeforeEach
	void setUp() throws Exception {
		conta = new Conta1("Raquel", "000000000-99", 123);
	}

	@Test
	@DisplayName("Teste do contrutor (saldo 0)")
	void testConta1() {
		assertEquals(0.0, conta.getSaldo(), 0.005);
	}

	@Test
	@DisplayName("Saque de valor negativo")
	void testSacar1() {
		conta.sacar(-0.1);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Saque de valor maior")
	void testSacar2() {
		conta.sacar(0.1);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Saque de valor OK")
	void testSacar3() {
		conta.depositar(10.0);
		conta.sacar(0.1);
		assertEquals(9.90, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Deposito de valor negativo, saldo 0")
	void testDepositar() {
		conta.depositar(-0.1);
		assertEquals(0.0, conta.getSaldo(), 0.0005);

	}

	@Test
	@DisplayName("Deposito de valor negativo, saldo >0")
	void testDepositar2() {
		conta.depositar(0.1);
		conta.depositar(-0.1);
		assertEquals(0.1, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Deposito de valor 0")
	void testDepositar3() {
		conta.depositar(0.0);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Deposito de valor ok")
	void testDepositar4() {
		conta.depositar(0.1);
		assertEquals(0.1, conta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Transfere 0")
	void testTransferir() {
		Conta1 outraConta = new Conta1("Joicy", "111111111-99", 12);
		outraConta.transferir(conta, 0.0);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
		assertEquals(0.0, outraConta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Transfere <0")
	void testTransferir1() {
		Conta1 outraConta = new Conta1("Joicy", "111111111-99", 12);
		outraConta.transferir(conta, -0.01);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
		assertEquals(0.0, outraConta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Transfere >0, sem saldo")
	void testTransferir2() {
		Conta1 outraConta = new Conta1("Joicy", "111111111-99", 12);
		outraConta.transferir(conta, 0.01);
		assertEquals(0.0, conta.getSaldo(), 0.0005);
		assertEquals(0.0, outraConta.getSaldo(), 0.0005);
	}

	@Test
	@DisplayName("Transfere >0 ok")
	void testTransferir3() {
		Conta1 outraConta = new Conta1("Joicy", "111111111-99", 12);
		outraConta.depositar(1000000.0);
		outraConta.transferir(conta, 0.29);
		assertEquals(0.29, conta.getSaldo(), 0.0005);
		assertEquals(1000000 - 0.29, outraConta.getSaldo(), 0.0005);
	}

	//
	// @Test
	// void testEqualsObject() {
	// fail("Not yet implemented");
	// }
	//
}
