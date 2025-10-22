import java.util.Scanner;

public class contagemDeDiasDeNamoro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("A quantos dias estamos juntos");

        System.out.println("Digite quantos anos estão juntos: ");
        int anosJuntos = sc.nextInt();

        System.out.println("E quantos Mêses?: ");
        int mesesJuntos = sc.nextInt();

        int diasDeAnos = anosJuntos * 365;
        int diasDeMeses = mesesJuntos * 30;
        int totalDeDias = diasDeAnos + diasDeMeses;
        int totalDeHoras = totalDeDias * 24;

        System.out.println("Estamos juntos há : " + totalDeDias +  " dias ❤️, oque corresponde há "  + totalDeHoras + " Horas.");

        sc.close();
    }
}
