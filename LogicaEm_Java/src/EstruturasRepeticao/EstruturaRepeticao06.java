package EstruturasRepeticao;

import java.util.Scanner;

public class EstruturaRepeticao06 {
    public static void main(String[] args) {

        Scanner Scnumero = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero maior que 10: ");
            numero = Scnumero.nextInt();
        }while (numero <= 10);
        System.out.println("Você digitou: " + numero);
    }
}
