package MultipleInheritance;

public class Lab28 {
    public static void main(String[] args) {

        Child ch1 = new Child();
        ch1.bhk3();
        ch1.bhk2();
        ch1.bhk1();

        //dynamic dispatch
        GrandFather gr1 = new Father();
        gr1.bhk1();
        Father fa1 = new Child();
        fa1.bhk2();

    }
}
