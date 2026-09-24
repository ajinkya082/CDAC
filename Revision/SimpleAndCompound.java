public class SimpleAndCompound {
    public static void main(String[] args) {
        int time=2;
        int rate=5;
        double amt=2000;
        double simple_interest=(amt*rate*time)/100;

        System.out.println("The simple interest is : " + simple_interest);

        // compound interest

        double A=amt;
        for(int i=1;i<=time;i++){
            A=A*(1+rate/100.0);
        }
        double compound=A-amt;
        System.out.println("The compound interest is : "+ compound);


    }
}
