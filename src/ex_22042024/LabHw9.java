package ex_22042024;

import java.util.Scanner;

public class LabHw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        long count = 1;
        if (num >= 1) {
            for (int i = 0; i <= num; i++) {
                count = count % num;
                if (count == 0) {
                    System.out.println("Not a prime" +count);
                } else System.out.println("Prime");
            }
        }
    }
}
