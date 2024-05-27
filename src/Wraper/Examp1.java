package Wraper;

public class Examp1 {
    public static void main(String[] args) {
        Integer x = 400, y = 400;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        Integer a1 = 40, b1 = 40;
        if (a1 == b1)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        Integer x1 = new Integer(40), y1= new Integer(40);
        if (x1 == y1)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        Integer X2 = new Integer(10);
        Integer Y2 = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(X2 == Y2);


    }


}
