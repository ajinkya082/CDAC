public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // b=a^b;
        // a=b^a;
        // b=a^b; swapping 

        b=a+b;
        a=b-a;
        b=b-a;


        System.out.println(a);
        System.out.println(b);
    }
}
