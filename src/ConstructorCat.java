/**
 * Created by Mihnea on 06.04.2017.
 */
public class ConstructorCat {
    public ConstructorCat() {
        System.out.println("First, an undefined cat is created.");
        System.out.println("And below...");
    }
    public ConstructorCat(String name) {
        System.out.println("A cat named "+name+ " is created.");
    }

    public static void main(String[] args) {
//        new ConstructorCat();
        ConstructorCat c = new ConstructorCat();
        ConstructorCat cat1 = new ConstructorCat("Lola");
//        System.out.println(c);
    }
}

