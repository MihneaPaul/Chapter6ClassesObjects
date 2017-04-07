/**
 * Created by Mihnea on 06.04.2017.
 */
// anonymous class code

public class Anonymous {
public static int num;
    {
        System.out.println("Inside instance initializer 1.");
    }
    {
        System.out.println("Inside instance initializer 2.");
    }
    public Anonymous() { // Constructor
        System.out.println("Inside no args constructor.");

    }
    static {
         num=1245;
        System.out.println("Inside static initializer");
    }


    public static void main(String[] args) {
//        Anonymous anonymous1 = new Anonymous(); // Create object
//        System.out.println(anonymous);
        System.out.println("Inside main() #1. num: "+num);

        // Declare a reference variable of the class
        Anonymous anonymous;

        System.out.println("Inside main() #2. num: "+num);

        // Create an object
        new Anonymous();
        System.out.println("Inside main() #3. num: "+num);

        // Create another object
        new Anonymous();
    }
}
