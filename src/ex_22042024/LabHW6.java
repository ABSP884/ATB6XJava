package ex_22042024;

import java.util.Scanner;

public class LabHW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Char");
        char ent_c = sc.next().toCharArray()[0];
        if (ent_c == 'a'|| ent_c == 'e' || ent_c =='i'|| ent_c =='o'||ent_c=='u'){
            System.out.println("You entered Vowel");

        }
        else {
            System.out.println("Consonant");
        }
    }
}
