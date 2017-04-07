/**
 * Created by Mihnea on 03.04.2017.
 */
public class CorrectThisTest3 {

    static int varU = 555;
    static int varV = varU;
    static int a = 5;

    static int varW = CorrectThisTest3.varU;

    public static void main(String[] args) {
        varU=556;
        varV=varU;
        varW = CorrectThisTest3.varU;
        System.out.println("varU is "+varU);
        System.out.println("varV is "+varV);
        System.out.println("varW is "+varW);
        int b =a;
        System.out.println(a);
        System.out.println(b);
        int a = 6;
        System.out.println(a); // IA VALOAREA VARIABILEI LOCALE SI ASCUNDE PE CEA A VARIABILEI GLOBALE;
         b=a;
        System.out.println(b);
    }
}
