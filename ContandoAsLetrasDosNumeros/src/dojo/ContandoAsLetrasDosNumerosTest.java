package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContandoAsLetrasDosNumerosTest {

	@Test
	public void testConverteNumero1EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(1);
		assertEquals("um", valor);
	}
	
	@Test
	public void testConverteNumero2EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(2);
		assertEquals("dois", valor);
	}
	@Test
	public void testConverteNumero3EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(3);
		assertEquals("tres", valor);
	}
	@Test
	public void testConverteNumero4EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(4);
		assertEquals("quatro", valor);
	}
	@Test
	public void testConverteNumero5EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(5);
		assertEquals("cinco", valor);
	}
	@Test
	public void testConverteNumero6EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(6);
		assertEquals("seis", valor);
	}
	@Test
	public void testConverteNumero21EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(21);
		assertEquals("vinte e um", valor);
	}
	@Test
	public void testConverteNumero22EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(22);
		assertEquals("vinte e dois", valor);
	}
	@Test
	public void testConverteNumero23EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(23);
		assertEquals("vinte e tres", valor);
	}
	@Test
	public void testConverteNumero24EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(24);
		assertEquals("vinte e quatro", valor);
	}
	@Test
	public void testConverteNumero25EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(25);
		assertEquals("vinte e cinco", valor);
	}
	@Test
	public void testConverteNumero31EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(31);
		assertEquals("trinta e um", valor);
	}
	@Test
	public void testConverteNumero41EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(41);
		assertEquals("quarenta e um", valor);
	}
	@Test
	public void testConverteNumero51EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(51);
		assertEquals("cinquenta e um", valor);
	}@Test
	public void testConverteNumero61EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(61);
		assertEquals("sessenta e um", valor);
	}@Test
	public void testConverteNumero71EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(71);
		assertEquals("setenta e um", valor);
	}@Test
	public void testConverteNumero81EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(81);
		assertEquals("oitenta e um", valor);
	}
	@Test
	public void testConverteNumero91EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(91);
		assertEquals("noventa e um", valor);
	}
	/*@Test
	public void testConverteNumero26EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(26);
		assertEquals("vinte e seis", valor);
	}
	@Test
	public void testConverteNumero27EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(27);
		assertEquals("vinte e sete", valor);
	}
	@Test
	public void testConverteNumero28EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(28);
		assertEquals("vinte e oito", valor);
	}
	@Test
	public void testConverteNumero29EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(29);
		assertEquals("vinte e nove", valor);
	}
	@Test
	public void testConverteNumero30EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(30);
		assertEquals("trinta", valor);
	}
	
	@Test
	public void testConverteNumero31EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(31);
		assertEquals("trinta e um", valor);
	}
	
	@Test
	public void testConverteNumero32EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(32);
		assertEquals("trinta e dois", valor);
	}
	
	@Test
	public void testConverteNumero33EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(33);
		assertEquals("trinta e três", valor);
	}
	
	@Test
	public void testConverteNumero34EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(34);
		assertEquals("trinta e quatro", valor);
	}
	
	@Test
	public void testConverteNumero35EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(35);
		assertEquals("trinta e cinco", valor);
	}
	
	@Test
	public void testConverteNumero36EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(36);
		assertEquals("trinta e seis", valor);
	}
	
	@Test
	public void testConverteNumero37EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(37);
		assertEquals("trinta e sete", valor);
	}
	@Test
	public void testConverteNumero38EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(38);
		assertEquals("trinta e oito", valor);
	}
	@Test
	public void testConverteNumero39EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(39);
		assertEquals("trinta e nove", valor);
	}
	@Test
	public void testConverteNumero40EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(40);
		assertEquals("quarenta", valor);
	}
	@Test
	public void testConverteNumero41EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(41);
		assertEquals("quarenta e um", valor);
	}
	@Test
	public void testConverteNumero42EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(42);
		assertEquals("quarenta e dois", valor);
	}
	@Test
	public void testConverteNumero43EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(43);
		assertEquals("quarenta e três", valor);
	}
	@Test
	public void testConverteNumero44EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(44);
		assertEquals("quarenta e quatro", valor);
	}
	@Test
	public void testConverteNumero45EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(45);
		assertEquals("quarenta e cinco", valor);
	}
	@Test
	public void testConverteNumero46EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(46);
		assertEquals("quarenta e seis", valor);
	}
	@Test
	public void testConverteNumero47EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(47);
		assertEquals("quarenta e sete", valor);
	}
	@Test
	public void testConverteNumero48EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(48);
		assertEquals("quarenta e oito", valor);
	}
	@Test
	public void testConverteNumero49EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(49);
		assertEquals("quarenta e nove", valor);
	}
	
	@Test
	public void testConverteNumero50EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(50);
		assertEquals("cinquenta", valor);
	}
	@Test
	public void testConverteNumero51EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(51);
		assertEquals("cinquenta e um", valor);
	}
	@Test
	public void testConverteNumero52EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(52);
		assertEquals("cinquenta e dois", valor);
	}
	@Test
	public void testConverteNumero53EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(53);
		assertEquals("cinquenta e tres", valor);
	}
	@Test
	public void testConverteNumero54EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(54);
		assertEquals("cinquenta e quatro", valor);
	}
	@Test
	public void testConverteNumero55EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(55);
		assertEquals("cinquenta e cinco", valor);
	}
	@Test
	public void testConverteNumero56EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(56);
		assertEquals("cinquenta e seis", valor);
	}
	@Test
	public void testConverteNumero57EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(57);
		assertEquals("cinquenta e sete", valor);
	}
	
			
			@Test
			public void testNumLetrasEmUm() {
				assertEquals(2, ContandoAsLetrasDosNumeros.contaLetras("um"));
			}
			
			@Test
			public void testNumLetrasEmDois() {
				assertEquals(4, ContandoAsLetrasDosNumeros.contaLetras("dois"));
			}
			@Test
			public void testNumLetrasEmTres() {
				assertEquals(4, ContandoAsLetrasDosNumeros.contaLetras("tres"));
			}
			@Test
			public void testNumLetrasEmQuatro() {
				assertEquals(6, ContandoAsLetrasDosNumeros.contaLetras("quatro"));
			}
			@Test
			public void testNumLetrasEmCinco() {
				assertEquals(5, ContandoAsLetrasDosNumeros.contaLetras("cinco"));
			}*/
}

