package Day2;

public class SimpleArrayMain {
	
	public static void main(String[] args) {
		float[] temperatures=new float[5];
		temperatures[0]=63.5f;
		temperatures[1]=56.5f;
		temperatures[2]=50.5f;
		temperatures[3]=42.2f;
		temperatures[4]=20.2f;
		int size=temperatures.length;
		
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println("Temperature at "+i+" is " +temperatures[i]+" Cel");
		}
		System.out.println("================================================");
		
		for(float temp:temperatures) {
			System.out.println(temp);
		}
	}
}
