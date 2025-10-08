package Pratica.pratica02;

public class BancoCLiente {
    public static void main(String[] args) {
        ContaBanco cLiente01 = new ContaBanco();
        cLiente01.numConta = 10;
        cLiente01.tipo = "Corrente";
        cLiente01.proprietario ="bernardo";
        cLiente01.saldo= 99.55f;
        cLiente01.abrirConta=true;

        cLiente01.status();
    }
}
