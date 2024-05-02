package ex_22042024;

import java.util.Scanner;

public class LabHW11 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
           int i;
           int j;
           int count;
           for (i=2;i<=100;i++){
               count=0;
               for(j=2;j<i;j++)
                   if(i%j==0){
                       System.out.println(i+"not a prime");
                       count++;
                       break;
                   }
               if(count==0){
                   System.out.println(i+ "is a prime");
           }
               }


    }
}
