public class OperadoresAritimeticos {
    public static void main(String[] args) {

        double placaVideo = 1000.00;
        double processador = 300.00;
        double placaMae = 600.00;
        double desconto = 230.73;

        double valorPc= placaVideo + processador + placaMae;
        double valorComDescontoPix = valorPc - desconto;
        double valorTotalDividido= valorComDescontoPix / 2;

        System.out.println( "Valor total do Pc = R$" + valorTotalDividido);
    }
}


