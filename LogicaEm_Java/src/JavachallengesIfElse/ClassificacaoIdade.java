package JavachallengesIfElse;

import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {

        Scanner scIdade = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scIdade.nextInt();

        if (idade <=12){
            System.out.println("Criança");
        }
        else if (idade<=17) {
            System.out.println("Adolescente");
        }
        else if (idade <=59) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }

    }
}
