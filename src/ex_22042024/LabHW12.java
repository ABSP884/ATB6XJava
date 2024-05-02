package ex_22042024;

public class LabHW12 {
    public static void main(String[] args) {
        int i;
        for (i =1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("FIZZ");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
