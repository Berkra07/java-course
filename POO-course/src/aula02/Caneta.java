package aula02;

public class Caneta {


        public String modelo;
        public String cor;
        private float ponta;
        protected float carga;
        protected boolean tampada;

        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor: " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("tampada? " + this.tampada );
        }
        public void rabiscar(){
            if (this.tampada ){
                System.out.println("ERRO! A caneta esta tampada");
            } else {
                System.out.println("Rabiscando...");
            }
        }
        protected void tampar(){
            this.tampada=true;
        }
        protected void destampar (){
            this.tampada=false;
        }
}
