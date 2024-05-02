package ex_22042024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LabHW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number");
        int Num = sc.nextInt();
        if (Num%2==0){
            System.out.println("It is composite");
        }
        else {
            System.out.println("It is a prime number");
        }
    }
}
