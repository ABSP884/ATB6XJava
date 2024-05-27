package SingleInheritance;

public class Python extends Programming {
    String sp;
    void printInfo(){
        System.out.println("This is Python ");
    }

    public Python(String sp) {
        this.sp = sp;
    }

    public void bhk3(){
        System.out.println("Python child2 feature ");
    }
    void prinInfo(){
        System.out.println(" Programming info "+this.sp);
    }
}
