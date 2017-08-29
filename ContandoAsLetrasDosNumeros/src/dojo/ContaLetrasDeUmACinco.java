package dojo;

public class ContaLetrasDeUmACinco {

	public static void main(String[] args) {
		int numLetras = 0;

		for (int i = 1; i <= 29; i++) {
			numLetras=numLetras+ContandoAsLetrasDosNumeros.contaLetras(ContandoAsLetrasDosNumeros.converteEmLetra(i));
		}
		System.out.println("O número de letras é: " + numLetras);

	}

}
