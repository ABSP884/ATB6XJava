package Wraper;

public class LabExcept37 {
    public static void main(String[] args) {

        try {
            String sh = args[0];
            int a = Integer.parseInt(sh);
            int x = 10 / a;
            System.out.println(a);
            System.out.println(x);
        }catch (ArithmeticException | NumberFormatException | NullPointerException w){
            System.out.println("problem with code");
        }
        catch (Exception e) { //this is checked exception which means we can find in compile time so it is called checked exception
            System.out.println(e.getMessage());
        }
        finally {//try is used in finally
            System.out.println("which always get executed");
        }
    }
}
