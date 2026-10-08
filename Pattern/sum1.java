public class sum1 {
    //by recursion
    // public static int sum(int n){
    //     return n*(n+1)/2;
    // }
    // public static int sum1(int i,int sum){
    //     if(i<1) {
    //         // System.out.println(sum);
    //         return sum;
    //     }
    //     return sum1(i-1, sum+i); 
         
    // }
    public static int sum1(int n){
        if(n==0){
            return 0;
        }
        return n+sum1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum1(5));
    }
}
