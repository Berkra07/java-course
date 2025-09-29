package aula004;

public class Caneta {
    public String modelo;
    private Float ponta;

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
        ponta = p;
    }
}
