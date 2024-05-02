package ex_22042024;

import java.util.Scanner;

public class LabHW08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println("It is aLeap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
