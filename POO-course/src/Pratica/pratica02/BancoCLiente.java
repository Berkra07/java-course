package Pratica.pratica02;

public class BancoCLiente {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1245);
        p1.setProprietario("Mario Pintudo");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2123);
        p2.setProprietario("Julinha Pikopirtuk");
        p2.abrirConta("CP");
        p2.depositar(400);
        p2.estadoAtual();

    }
}
