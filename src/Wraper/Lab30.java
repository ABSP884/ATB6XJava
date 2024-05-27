package Wraper;

public class Lab30 {
    public static void main(String[] args) {
        int a = 123;
        String s1 ="san";

        //Integer in1 = Integer.valueOf(s1);
        //System.out.println(s1);
        String s2 = String.valueOf(a);
        System.out.println(s2);
        Character ch = 'w';
        char c1 = ch;  //This is called Unboxing means converting wrapper to primitive
        System.out.println(c1);
        Integer a2 = 34;//Wrapper to primitive Auto boxing (Primitive -> wrapper(Automatically)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(1,8));
        System.out.println(Integer.max(88,90));


    }
}
