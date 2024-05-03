package ex_22042024;

import java.util.Locale;
import java.util.Scanner;

public class LabHW13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1");
        int value1 = sc.nextInt();
        System.out.println("Enter Value2");
        int value2=sc.nextInt();
        System.out.println("Enter any of the Operator +,/,-,*,%");
        char  ope = sc.next().toCharArray()[0];
                switch(ope){
            case 'a':
                int Add=value1+value2;
                System.out.println("Addition of value1 & value2 are " +Add);
             break;
            case 's':
                int Sub=value1-value2;
               System.out.println("sub of value1 & value2 are " +Sub);
               break;
            case 'm':
                int Mul=value1*value2;
                System.out.println("multi of value1 & value2 are " +Mul);
                break;
            case 'd':
                int Div=value1/value2;
                System.out.println("Div of value1 & value2 are " +Div);
                break;
            case 'c':
                float Mod=value1%value2;
                System.out.println("Mod of value1 & value2 are " +Mod);
            default:
                System.out.println("not a operatior");


        }


    }
}
