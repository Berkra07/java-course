package JavachallengesIfElse;

import java.util.Scanner;

public class OlderOrYounger {
    public static void main(String[] args) {

        Scanner scage = new Scanner(System.in);

        int age = scage.nextInt();

        if (age>=18){
            System.out.println("Você tem: " + age + ", pode tirar a CNH");
        }
    }
}
