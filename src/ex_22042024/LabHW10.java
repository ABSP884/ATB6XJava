package ex_22042024;

import java.util.Scanner;

public class LabHW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println( num + " is not a prime");
        } else if (num >= 1) {
            for (int i = 1; i <= num; i++) {
                float value = i % num;
                        if (value == 0) {
                            System.out.println( num + "is  a prime");
                        }else System.out.println(num+"it's not a prime");

            }
        }
    }
}








