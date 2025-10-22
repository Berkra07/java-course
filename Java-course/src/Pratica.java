import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {

        Scanner ScNumeros = new Scanner(System.in);

        System.out.println("Digite um numero para saber se ele è par ou impar");
        int numero= ScNumeros.nextInt();

        if (numero %  2==0){
            System.out.println("O numero " + numero + " é par");
        }
        else {
            System.out.println("Numero impar");
        }


    }
}
