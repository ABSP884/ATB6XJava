package ex_22042024;


import java.util.Scanner;

public class LabHW21 {
    public static void main(String[] args) {
        int[][] arr = {{23, 67, 3},
                {10, 45, 67},
                {5, 8, 1}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int value = sc.nextInt();
        int find = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j<i; j++) {
                if (arr[i][j] == find) {
                    find = arr[i][j];
                }System.out.println("Value not found in a given array"+find);
            }
            System.out.println("find "+find);
        }
    }
}
