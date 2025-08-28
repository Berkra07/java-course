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
        }
    }
}
