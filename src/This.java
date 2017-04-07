/**
 * Created by Mihnea on 03.04.2017.
 */
public class This {

     int varU=555; //instance variable, exists only in the context of an instance.
//    static int varV=varU; //class variables
   protected int num=1994;
    // => STATIC varV NU POATE PRIMIT VALOAREA varU CARE E INSTANCE.
    // DAR:
    static int varX=555;
    int varY=varX; //SE POATE. Variabila instance poate primi valoarea unei class variable.

    void printNum(int num) { //daca scriu aici tot num, va printa ACEST num, nu cel global (NAME HIDING).
        System.out.println("Parameter num:"+num);
        System.out.println("Instance variable num is: "+this.num); //daca pun THIS, se a referi la INSTANCE VARIABLE (num-ul global).
    }

    public static void main(String[] args) {
        This method =new This();
        method.printNum(1995);
    }
}
