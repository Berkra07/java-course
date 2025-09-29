package aula004;

import aula02.Caneta;

public class Aula04 {
    public static void main(String[] args) {
        CanetaAula04 caneta1 = new CanetaAula04();
        caneta1.setModelo("Bic");
        caneta1.setPonta(0.5f);
       // caneta1.status();


        // Getters
        System.out.println("Eu tenho uma Caneta " + caneta1.getModelo() + " de ponta " + caneta1.getPonta());


        // Metodo construtor

    }
}
