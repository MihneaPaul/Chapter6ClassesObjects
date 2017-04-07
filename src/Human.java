/**
 * Created by Mihnea on 03.04.2017.
 */
import static java.lang.System.out;
import java.lang.Math.*;
public class Human {

    private String name;
    private String gender;
    private static int count;
    private static int g=2;

    public static void main(String[] args) {
        //Create an instance of Human class
        Human jack = new Human();
        //increase count by one
        Human.count++;

        //Assign values to name and gender
            jack.name="Jack Parker";
            jack.gender="Male";

        //Read and print the values of name, gender and count
            String jackName = jack.name;
            String jackGender = jack.gender;
            long population = Human.count;

        out.println("Name: "+jack.name);
        System.out.println("Gender: "+jackGender);
        System.out.println("Population: "+population);

        //Change the name
        jack.name="Jackie Parker";

        //Read and print the changed name
        String changedName=jack.name;
        System.out.println("Changed name: "+changedName);
        add(20,20);

        }
        public static int add(int n1, int n2){
        int a =g;
        int g=10;
        int c=g;
            System.out.println("a este: "+ a+", c este: "+c);
        int sum = n1 + n2;
            System.out.println(sum);
            return sum;
        }
    }

