import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {

        Scanner ScNumeros = new Scanner(System.in);

        System.out.println("Digite um numero");
        int Numero= ScNumeros.nextInt();

        if (Numero %  2==0){
            System.out.println("NUmero par");
        }
        else {
            System.out.println("Numero impar");
        }


    }
}
