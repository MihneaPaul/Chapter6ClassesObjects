/**
 * Created by Mihnea on 06.04.2017.
 */

//Varargs method

public class MathUtil {
    public static int max(int n1, int n2, int...num) {
        int max = (n1 > n2 ? n1 : n2);
        for (int currentNumber : num) {
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }

    public static void main(String...args) {
        int max = MathUtil.max(1,4,7,12,25,14,5);
        System.out.println(max);
        MathUtil main = new MathUtil();
        main.toString();
        MathUtil u = new MathUtil();

        Class math = u.getClass();
        String fullName = math.getSimpleName();
        System.out.println(fullName);
    }

}
