
package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContandoAsLetras {

    @Test
    public void testConverteNumero1EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(1);
        assertEquals("um", valor);
    }
    
    private static String converteEmLetra(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testConverteNumero2EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(2);
        assertEquals("dois", valor);
    }
    @Test
    public void testConverteNumero3EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(3);
        assertEquals("tres", valor);
    }
    @Test
    public void testConverteNumero4EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(4);
        assertEquals("quatro", valor);
    }
    @Test
    public void testConverteNumero5EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(5);
        assertEquals("cinco", valor);
    }
    @Test
    public void testConverteNumero6EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(6);
        assertEquals("seis", valor);
    }
    @Test
    public void testConverteNumero21EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(21);
        assertEquals("vinte e um", valor);
    }
    @Test
    public void testConverteNumero22EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(22);
        assertEquals("vinte e dois", valor);
    }
    @Test
    public void testConverteNumero23EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(23);
        assertEquals("vinte e tres", valor);
    }
    @Test
    public void testConverteNumero24EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(24);
        assertEquals("vinte e quatro", valor);
    }
    @Test
    public void testConverteNumero25EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(25);
        assertEquals("vinte e cinco", valor);
    }
    @Test
    public void testConverteNumero31EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(31);
        assertEquals("trinta e um", valor);
    }
    @Test
    public void testConverteNumero41EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(41);
        assertEquals("quarenta e um", valor);
    }
    @Test
    public void testConverteNumero51EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(51);
        assertEquals("cinquenta e um", valor);
    }@Test
    public void testConverteNumero61EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(61);
        assertEquals("sessenta e um", valor);
    }@Test
    public void testConverteNumero71EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(71);
        assertEquals("setenta e um", valor);
    }@Test
    public void testConverteNumero81EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(81);
        assertEquals("oitenta e um", valor);
    }
    @Test
    public void testConverteNumero91EmLetra () {
        String valor = ContandoAsLetras.converteEmLetra(91);
        assertEquals("noventa e um", valor);
}