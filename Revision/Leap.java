public class Leap {
    public static void main(String[] args) {
        int year=1900;
        if((year%400==0 || (year%4==0 && year%100!=0))){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");

        }
    }
}
