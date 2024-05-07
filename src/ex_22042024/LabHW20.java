package ex_22042024;

public class LabHW20 {
    public static void main(String[] args) {
        int[][] arr = { {23,67,3},
                        {10,45,67},
                         {5,8,1}   };

//Finding max value in 2d Array
        int max =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++)
             if (arr[i][j]>max){
                 max=arr[i][j];
             }
        }
        System.out.println("max value is "+max);
    }

}
