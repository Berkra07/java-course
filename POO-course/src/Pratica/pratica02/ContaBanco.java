package Pratica.pratica02;

import java.util.Objects;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String proprietario;
    private float saldo;
    private boolean ContaAberta;

    public void estadoAtual(){

        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getProprietario());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Conta aberta: " + this.getContaAberta());
        System.out.println("________________________________________");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setContaAberta(true);
        if(t== "CC"){
            this.setSaldo(50);
        }
        else if (Objects.equals(t, "CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta!");
        System.out.println("Bem vindo " + this.getProprietario() + " !!!");
    }
    public void fecharConta(){
        if (this.getSaldo()> 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo()<0) {
            System.out.println("Conta não pode ser fechada pois tem debito");
        }
        else {
            this.setContaAberta(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (this.getContaAberta()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com sucesso para " + this.getProprietario());
        }
        else {
            System.out.println("Impossivel depositar, Crie uma conta.");
        }
    }
    public void sacar(float v){
        if (this.getContaAberta()){
            if (this.getSaldo()>=v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getProprietario());
            }
            else {
                System.out.println("valor indisponivel para saque");
            }
        }
        else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensalidade(){
        int v=0;
        if (getTipo()=="CC"){
            v=12;
        } else if (getTipo() == "CP") {
            v=20;
        }
        if (this.getContaAberta()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getProprietario());
        }
        else {
            System.out.println("Imposivel pagar, saldo insuficiente");
        }

    }

    //Métodos Especiais
    
    public void ContaBanco(){
        this.saldo=0;
        this.ContaAberta =false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getContaAberta() {
        return ContaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.ContaAberta = contaAberta;
    }
}
