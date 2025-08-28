package JavachallengesIfElse;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {

        Scanner scIdade = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scIdade.nextInt();

        if (idade <=12){
            System.out.println("Criança");
        }
        

    }
}
