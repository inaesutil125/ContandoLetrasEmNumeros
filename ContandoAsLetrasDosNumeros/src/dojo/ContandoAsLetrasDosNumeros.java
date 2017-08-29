package dojo;

public class ContandoAsLetrasDosNumeros {
	public static String converteEmLetra(int numero) {

		if (numero == 1) {
			return "um";
		}
		if (numero == 2) {
			return "dois";
		}
		if (numero == 3) {
			return "tres";
		}
		if (numero == 4) {
			return "quatro";
		}
		if (numero == 5) {
			return "cinco";
		}
		if (numero == 6) {
			return "seis";
		}
		if (numero == 7) {
			return "sete";

		}
		if (numero == 8) {
			return "oito";
		}
		if (numero == 9) {
			return "nove";
		}
		if (numero == 10) {
			return "dez";
		}
		if (numero == 11) {
			return "onze";
		}
		if (numero == 12) {
			return "doze";
		}
		if (numero == 13) {
			return "treze";
		}
		if (numero == 14) {
			return "quatorze";
		}
		if (numero == 15) {
			return "quinze";
		}
		if (numero == 16) {
			return "dezesseis";
		}
		if (numero == 17) {
			return "dezessete";
		}
		if (numero == 18) {
			return "dezoito";
		}
		if (numero == 19) {
			return "dezenove";
		}
		if (numero == 20) {
			return "vinte";
		}
		if (numero > 20 && numero < 30) {
			return "vinte e " + converteEmLetra(numero - 20);
		}
		if (numero > 30 && numero < 40) {
			return "trinta e " + converteEmLetra(numero - 30);
		}
		if (numero > 40 && numero < 50) {
			return "quarenta e " + converteEmLetra(numero - 40);
		}

		if (numero > 50 && numero < 60) {
			return "cinquenta e " + converteEmLetra(numero - 50);
		}

		if (numero > 60 && numero < 70) {
			return "sessenta e " + converteEmLetra(numero - 60);
		}

		if (numero > 70 && numero < 80) {
			return "setenta e " + converteEmLetra(numero - 70);
		}

		if (numero > 80 && numero < 90) {
			return "oitenta e " + converteEmLetra(numero - 80);
		}

		if (numero > 90 && numero < 100) {
			return "noventa e " + converteEmLetra(numero - 90);
		}

		return null;
	}

	public static int contaLetras(String texto) {

		return texto.length();

	}

}