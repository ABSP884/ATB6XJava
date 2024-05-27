package SingleInheritance;

public class Programming {
    int version;
    String author;

     Programming() {
        System.out.println("Default constructor for Program as Base class");
            }

    Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }
     public void one(){
         System.out.println("Parent  one");
     }
     void prinInfo(){
         System.out.println(" Programming info "+this.version +"and " +this.author);
     }
     public void bhk3(){
         System.out.println("Parent feature ");
     }
}
