package aula02;

public class Aula02 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo="Bic Azul";
        c1.cor= "Azul";
        c1.ponta= 0.5f;
        c1.carga = 9.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic verde";
        c2.cor="Verde";
        c2.ponta=2.0f;
        c2.carga = 10;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
