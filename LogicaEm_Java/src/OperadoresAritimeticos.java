public class OperadoresAritimeticos {
    public static void main(String[] args) {

        double placaVideo = 1000.00;
        double processador = 300.00;
        double placaMae = 600.00;
        double desconto = 230.73;
        int valorMensal= 30;

        double valorPc= placaVideo + processador + placaMae;
        double valorComDescontoPix = valorPc - desconto;
        double valorTotalDividido= valorPc / 2;
        double valorTotalMensal = valorComDescontoPix * valorMensal;

        System.out.println( "valor bruto do PC = R$" + valorPc);
        System.out.println( "Valor total com desconto = R$" + valorComDescontoPix);
        System.out.println( "Valor dividido em 2= R$" + valorTotalDividido);
        System.out.println( "Valor total por mês = R$" + valorTotalMensal);
    }
}


