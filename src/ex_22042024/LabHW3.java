package ex_22042024;

public class LabHW3 {
    public static void main(String[] args) {

        int x= 10;//10;
        float  y= 10;//12.4f;
        float z = 10;//56.76f;
        //double result = Math.cbrt(Math.sqrt(x)+Math.sqrt(y)-Math.abs(z)) ;
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
                System.out.println(result);

    }
}
