package SingleInheritance;

public class Lab25 {

    public static void main(String[] args) {
        Programming p1 = new Programming(12,"Santi");
        Java j1= new Java("Lamda");
        p1.prinInfo();
        j1.printInfo();
        p1.bhk3();
        j1.bhk3();
        p1.one();

        Python p2 = new Python("Python new feature");
        p2.prinInfo();

    }

}
