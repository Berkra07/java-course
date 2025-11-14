package TernarioIfElse;

public class Ex01ternario {
    public static void main(String[] args) {

        /* ternario:
        *
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso; */

        int idade = 18;

        String resultado = (idade > 17) ? "você é maior de idade" : "Menor de idade";
        System.out.println( resultado);
    }
}

