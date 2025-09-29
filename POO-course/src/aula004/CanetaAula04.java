package aula004;

public class CanetaAula04 {
    public String modelo;
    private Float ponta;
    private boolean tampada;
    private String cor;

    public CanetaAula04(){
        this.tampar();
        this.cor = "Azul";
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo= m;
    }

    public Float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar (){
        this.tampada = false;
    }

    public void status (){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println( "Cor: "+ cor );
        System.out.println("tampada: " + tampada);
    }
}
