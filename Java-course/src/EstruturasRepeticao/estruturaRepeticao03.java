package EstruturasRepeticao;

public class estruturaRepeticao03 {
    public static void main(String[] args) {


/*          A Condição é verificada no final do loop  (pouco usado)
*           sempre executa pelomenos umas vez*/


        int cambalhotas = 0;

        do {
            System.out.println("Contador do-while " + cambalhotas);
            cambalhotas ++;
        }while (cambalhotas<5);
    }
}
