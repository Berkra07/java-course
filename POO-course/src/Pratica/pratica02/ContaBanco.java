package Pratica.pratica02;

public class ContaBanco {

    int numConta;
    String tipo;
    String dono;
    float saldo;
    boolean abrirConta;


    public void status(){
        System.out.println(numConta);
        System.out.println(tipo);
        System.out.println(dono);
        System.out.println(saldo);
        System.out.println(abrirConta);
    }
}
