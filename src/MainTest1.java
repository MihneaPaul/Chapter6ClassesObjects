/**
 * Created by Mihnea on 03.04.2017.
 */
public class MainTest1 {
    private int a=5;
    private int sum=1;
    private int b=6;
    public static void main(String[] args) {
        MainTest1 method = new MainTest1();
        System.out.println("Inside main() method of the MainTest1 class.");
        int d = method.sum;
        method.m1();
        System.out.println("tralala");
        System.out.println(d);
        method.add(2,3);
        method.multiply();
    }

    private void m1() {
        System.out.println("Inside m1()");
        System.out.println("sum = "+sum);
    }
    public int add(int a, int b) {
//        a = 2;
//        b=3;
        int sum = this.a + this.b;
        System.out.println(sum);
        return sum;
    }
    public int multiply() {
        this.sum = add(2,3) * 2;
        System.out.println(sum);
        return sum;
    }
}

