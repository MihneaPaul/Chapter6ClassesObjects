/**
 * Created by Mihnea on 03.04.2017.
 */

public class AccessLevelTest1 extends AccessLevel {

    public static void main(String[] args) {
        AccessLevelTest1 al = new AccessLevelTest1();

        int a = al.getV1(); // invoking variable v1;
        int b = al.v2;
        int c = al.v3;
        int d = al.v4;
        System.out.println("a is: " + a + ", b is " + b + ", c is " + c + ", d is " + d);

        al.getV1(); // invoking method m1();
        al.setV1(10);
        al.m2(); // invoking method m2();
        al.m3(); // invoking method m3();
        al.m4(); // invoking method m4();

        //Modify values
        al.v2 = 20;
        al.v3 = 30;
        al.v4 = 40;

        System.out.println("After modifying v2,v3,v4");
        al.m2();
        al.m3();
        al.m4();
    }
}





