public class sample
{
    public static void m1(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        m1(i-1,n);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");

        m1(5,5);
	}
}