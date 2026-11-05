package Practise;

public class MyExceptionExample {
	private static  String[] names= {
		"Virat",
		"Rohit",
		"Shreyash",
		"Shardul",
		"Mahi"
	};
	
	public static int getPosition(String name) throws MyException{
		int position=-1;
		for(int i=0;i<5;i++) {
			String nm=names[i];
			if(nm.equals(name)) {
				position=i;
				break;
			}
			if(position==-1) {
				MyException me=new MyException(name,"Not Found Please enter valid name");
				throw me;
			}
		}
		return position;
	}
}
