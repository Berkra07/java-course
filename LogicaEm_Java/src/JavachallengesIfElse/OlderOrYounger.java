package JavachallengesIfElse;

import java.util.Scanner;

public class OlderOrYounger {
    public static void main(String[] args) {

        Scanner scage = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scage.nextInt();

        if (age>=18){
            System.out.println("Você tem: " + age + " anos, pode tirar a CNH");
        }
        else {
            System.out.println("Você tem: " + age + " anos, Volte quando tiver 18 anos ou mais.");
        }
    }
}
