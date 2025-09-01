package JavachallengesIfElse;

import java.util.Scanner;

public class DesafiosSwitch {
    public static void main(String[] args) {


//        DESAFIO 01: Dia da semana --------------------------------------------------------------

        Scanner scWeekVerific = new Scanner(System.in);

        System.out.println("Digite um numero que direi que dia da semana é hoje: ");

        int weekVerific = scWeekVerific.nextInt();

        switch (weekVerific){

            case 1:
                System.out.println("Hojé é Segunda-feira");
                break;
            case 2:
                System.out.println("Hoje é terça-feira");
            break;
            case 3:
                System.out.println("Hoje é quarta-feira");
                break;
            case 4:
                System.out.println("hoje é quinta-feira");
                break;
            case 5:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 6:
                System.out.println("Hoje é Sabado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
        }
    }
}

class Desafiodois {
    public static void main(String[] args) {
        Scanner scNotaLanche = new Scanner(System.in);

        System.out.println("De uma Nota de 0 a 6 para o lanche: ");

        int notaLanche = scNotaLanche.nextInt();

        switch (notaLanche) {

            case 1:
                System.out.println("Reprovado");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Ótimo");
                break;
            case 6:
                System.out.println("Exelente");

        }
    }
}