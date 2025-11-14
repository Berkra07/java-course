package TernarioIfElse;

import java.util.Scanner;

public class ex02NumeroParImpar {
    public static void main(String[] args) {
        System.out.println("Digite um numero para saber se ele é par ou impar:");

        Scanner scParImpar = new Scanner(System.in);
        int parImpar = scParImpar.nextInt();



        String resultado = (parImpar % 2 == 0) ? "numero par" : "Numero impar";
        System.out.println(resultado);
    }
}
