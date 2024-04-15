package ex_22042024;

public class LabHW {
    public static void main(String[] args) {

        int a=819;int b=1;int c=90;
        int Maximum = (a>b) ? a :(c<b) ? b: (c<a) ? a: c ;
              //a<b ? b:(b<c) : c ? (a<c) :c ;
        System.out.println(Maximum);

    }
}
