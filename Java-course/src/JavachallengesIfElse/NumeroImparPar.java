package JavachallengesIfElse;
import java.util.Scanner;
public class NumeroImparPar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long numero1 = sc.nextLong();

        // (%) é o operador de resto da divisão.//
        if (numero1 % 2 == 0) {
            System.out.println("O número " + numero1 + " é PAR.");
        }
        else {
            System.out.println("O número " + numero1 + " é ÍMPAR.");
        }

    }
}
