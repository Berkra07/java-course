package aula02;

public class Caneta {


        String modelo;
        String cor;
        float ponta;
        float carga;
        boolean tampada;

        void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.print("cor: " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("esta tampada? " + this.tampada );
        }
        void rabiscar(){

        }
        void tampar(){

        }
        void destampar (){
        }
}
