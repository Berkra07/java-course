package aula02;

public class Caneta {


        String modelo;
        String cor;
        float ponta;
        float carga;
        boolean tampada;

        void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.print("Cor: " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Esta tampada? " + this.tampada );
        }
        void rabiscar(){
            if (this.tampada ){
                System.out.println("ERRO! A caneta esta tampada");
            }
            else {
                System.out.println("Rabiscando...");
            }
        }
        void tampar(){
            this.tampada=true;
        }
        void destampar (){
            this.tampada=false;
        }
}
