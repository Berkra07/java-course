package JavachallengesIfElse;
import java.util.Scanner;
public class NotaEscolar {
    public static void main(String[] args) {



        Scanner nota = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int notaSchool = nota.nextInt();

        if (notaSchool >= 70) {
            System.out.println("Você tirou " + notaSchool + ". Aprovado.");
        } else if (notaSchool >= 60 && notaSchool < 70) {
            System.out.println("Você tirou " + notaSchool + ".Recuperação.");
        } else {
            System.out.println("Você tirou " + notaSchool + ". Reprovado.");
        }

    }
}
