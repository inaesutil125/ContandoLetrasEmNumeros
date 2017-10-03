
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
    }