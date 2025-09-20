package EstruturasRepeticao;

import java.util.Scanner;

public class EstruturaRepeticao06 {
    public static void main(String[] args) {

        Scanner Scnumero = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um valor positivo: ");
            numero = Scnumero.nextInt();
        }while (numero <= 0);
        System.out.println("Você digitou: " + numero);
    }
}
