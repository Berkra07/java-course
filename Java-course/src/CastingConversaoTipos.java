public class CastingConversaoTipos {
    public static void main(String[] args) {
        /*  Casting (conversão de tipos)
        *
        * Conversão Implicita: Ocorre automaticamente quando convertemos um tipo menor para um tipo maior:
        *       int i=10;
        *       double d =i;
        *
        * Conversão Explícita: Precisamos fazer manualmente ao converter um tipo  maior para um tipo menor:
        *       double d2= 10.5;
        *       int i2= (int) d2;              */

//       conversao Implicita:

        int numero = 7;
        double nd = numero;

//       Conversão Explicita (Com casting)

        double numero2 = 7.11;
        int nd2 = (int) numero2;

        System.out.println(nd);
        System.out.println( nd2);

//        integer é mais usado que o int, Pois nao é um tipo primitivo (da para fazer conversao para string por Ex)
//        Integer -> String

        Integer numeroInteger= 999;
        String convetInteger= numeroInteger.toString();
        System.out.println(convetInteger + " . " + convetInteger);
    }
}
