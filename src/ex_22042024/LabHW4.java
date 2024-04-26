package ex_22042024;

import java.util.Scanner;

public class LabHW4 {
    public static void main(String[] args) {
        //int a=-9 ;
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        if (a==0){
            System.out.println("Zero");
        }
        else if(a>1) {
            System.out.println("Positive value");

        }else {
            System.out.println("Negative");
        }
    }


}
