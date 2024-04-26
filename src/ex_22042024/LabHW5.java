package ex_22042024;

import java.util.Scanner;

public class LabHW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter b value");
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter c value");
        int c = sc2.nextInt();

        if (a>b){
            System.out.println("a is big");
        }
        else if (b>c){
            System.out.println("b is big");
        }
           else if(c>a){
            System.out.println("c is big");
           }
    }
}
