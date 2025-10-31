package aula004;

import aula02.Caneta;

public class Aula04 {
    public static void main(String[] args) {
        CanetaAula04 caneta1 = new CanetaAula04("Chulebrão","Rosa", 0.9f);
        caneta1.status();
        System.out.println("-------------------------------------");
        System.out.println("Caneta Dois");
        CanetaAula04 caneta2 = new CanetaAula04("Chureba", "Marrom", 1.0f);
        caneta2.status();
    }
}
