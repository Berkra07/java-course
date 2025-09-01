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
