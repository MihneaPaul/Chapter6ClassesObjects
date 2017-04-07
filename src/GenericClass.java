/**
 * Created by Mihnea on 06.04.2017.
 */
public class GenericClass<T> {
    private T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>("Hello");
        String s1 = g1.get();
        System.out.println("G1 = "+s1);

        g1.set("Testin generics");
        String s2 = g1.get();
        System.out.println("G2 = "+s2);

        g1.set(null);
        String s3 = g1.get();
        System.out.println("G3 = "+s3);



    }
}
