public class OperadoresAritimeticos {
    public static void main(String[] args) {

        double placaVideo = 1000.00;
        double processador = 300.00;
        double placaMae = 600.00;
        double desconto = 230.73;
        int valorMensal= 30;

        double valorPc= placaVideo + processador + placaMae;
        double valorComDescontoPix = valorPc - desconto;
        double valorTotalDividido= valorComDescontoPix / 2;
        double valorTotalMensal = valorComDescontoPix * valorMensal;

        
        System.out.println( "Valor total do PC (com desconto) = R$" + valorComDescontoPix);
        System.out.println( "Valor Dividido em 2= R$" + valorTotalDividido);
    }
}


