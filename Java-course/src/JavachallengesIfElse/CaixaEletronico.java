package JavachallengesIfElse;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        System.out.println("Digite valor total = " );

        Scanner scValorTotal = new Scanner(System.in);
        int valorTotal = scValorTotal.nextInt();
        int resto = valorTotal % 50;
        if (valorTotal>=50) {
            int ceulasDe50 = valorTotal / 50;
            System.out.println("Cedulas de 50= " + ceulasDe50);
        }

        if (resto>=20) {
        int cedulasDe20 = resto / 20;
        System.out.println("cedulas de 20= " + cedulasDe20);

    }
    }
}
