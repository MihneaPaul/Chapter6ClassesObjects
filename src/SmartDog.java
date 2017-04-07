/**
 * Created by Mihnea on 06.04.2017.
 */
public class SmartDog {
    String name;
    double age;

//    public SmartDog() {
//        this.name ="Unknown";
//        this.age = 0.0;
//        System.out.println("Using SmartDog() constructor");
//    }

    // SAU: (call second constructor an put the default parameters in it)

    public SmartDog() {

        this("Unknown", 0.0);
    }
    public SmartDog(String name, double age) {
        this.name = name;
        this.age = age;
        System.out.println("Using SmartDog(name, age) constructor");
    }
    public void bark() {
        System.out.println(name + " is barking");
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(double age){
        this.age = age;
    }
    public double getAge() {
        return this.age;
    }

    public void printDetails() {
        System.out.print("Name: "+this.name);
        if(age>0.0){
            System.out.println(", age: "+this.age);
        }
        else {
            System.out.println(", age: Who knows?");
        }
    }

    public static void main(String[] args) {
        // Create two SmartDog objects
        SmartDog dog1 = new SmartDog();
        SmartDog dog2 = new SmartDog("Nova", 8.0);

        // Print details about the two dogs
        dog1.printDetails();
        dog2.printDetails();

        // Make them bark
        dog1.bark();
        dog2.bark();

        // Change details for Unknown dog
        dog1.setName("Blackie");
        dog1.setAge(4.2);

        // Print details again
        dog1.printDetails();
        dog2.printDetails();

        // Make them bark again
        dog1.bark();
        dog2.bark();
    }
}
