package dojo;

public class ContandoDeUmACinco {

    private static final String ContandoAsLetras = null;

	public static void main(String[] args) {
        int numLetras = 0;

        for (int i = 1; i <= 91; i++) {
            numLetras=numLetras+ContandoDeUmACinco.contaLetras(ContandoAsLetras.converteEmLetra(i));
        }
        System.out.println("O número de letras é: " + numLetras);

    }

}