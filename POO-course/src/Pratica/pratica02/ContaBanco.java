package Pratica.pratica02;

public class ContaBanco {

    int numConta;
    String tipo;
    String proprietario;
    float saldo;
    boolean abrirConta;


    public void status(){
        System.out.println("numero da conta: " + numConta);
        System.out.println("Tipo de conta:  "+tipo);
        System.out.println("Proprietario da conta: " + proprietario);
        System.out.println("Saldo da conta: R$" + saldo);
        System.out.println(abrirConta);
    }
}
