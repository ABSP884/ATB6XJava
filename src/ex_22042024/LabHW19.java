package ex_22042024;

public class LabHW19 {
    public static void main(String[] args) {
        int[] num = {12,7,8};
        int[] num1= new int[3];
        for (int i =0;i<num.length;i++){
            num1[i]=num[i]*2;
        }
        System.out.println("Printing Arrays");
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}
