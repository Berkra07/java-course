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

        if (resto>= 10){
            int cedulasDe10 = resto / 10;
            System.out.println("Cédulas de R$ 10,00 = " + cedulasDe10);
        }
        if (resto>= 5){
            int cedulasDe5 = resto / 5;
            System.out.println("Cédulas de R$ 5,00= " + cedulasDe5);
        }
        if (resto>= 2){
            int cedulasDe2 = resto / 2;
            System.out.println("Cedulas de R$ 2,00 = " + cedulasDe2);
        }
        if (resto>=1){
            int moedaDe1 = resto;
            System.out.println("Moedas de R$ 1,00 = s" + moedaDe1);

        }
    }
}
