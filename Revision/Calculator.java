import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation to perform : ");
        String oper=sc.nextLine();

        switch (oper) {
            case "add":
                int add=num1+num2;
                System.out.println("The sum is : "+add);
                break;
            case "sub":
                int sub=num1-num2;
                System.out.println("The subtraction is : "+ sub);
                break;
            case "multi":
                int mult=num1*num2;
                System.out.println("The mult is : " + mult);
                break;
            case "div":
                int div = num1/num2;
                System.out.println("The division is : " + div);
                break;
            default:
                System.out.println("Invalid opertions");
                break;
        }
        sc.close();


    }
}
