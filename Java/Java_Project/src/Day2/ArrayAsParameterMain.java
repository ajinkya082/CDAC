package Day2;

public class ArrayAsParameterMain {

	private static double[] getSquareRoots(int[] allNumbers) {
		int size=allNumbers.length;
		double[] allSquareRoot=new double[size];
		int index=0;
		for(int everyNumber:allNumbers) {
			double squareRoot=Math.sqrt(everyNumber);
			allSquareRoot[index]=squareRoot;
			index++;
		}
		return allSquareRoot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {65,6,8,90,91,25,36};
		double[] squareRoots=getSquareRoots(numbers);
		for(double squareRoot:squareRoots) {
			System.out.println(squareRoot);
		}
	}

}
