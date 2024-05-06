package ex_22042024;

public class LabHW17 {
    public static void main(String[] args) {
        int[] sal= {99,8,10,5,301};

        int max_sal = Integer.MIN_VALUE;

        for(int i=0;i<sal.length;i++){

             if(sal[i]>max_sal)
            {
                max_sal = sal[i];

            }

        } System.out.println("Max value is"+max_sal);

    }
}
