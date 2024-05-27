package SingleInheritance;

public class Java extends Programming{
    String newver;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newver) {
        this.newver = newver;
    }
    void printInfo(){
        System.out.println("This is Java");
    }
    public void bhk3(){
        System.out.println("Java child1 feature ");
    }

}
