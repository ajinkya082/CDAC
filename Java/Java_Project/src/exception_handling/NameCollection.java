package exception_handling;

public class NameCollection {
	private static String[] names= {
		"Kashyap",
		"Manas",
		"Anish",
		"Preeti",
		"Shreeya"
	};
	
	public static int getPosition(String name) throws NameNotFoundException{
		int position =-1;
		for(int i=0;i<5;i++) {
			String nm=names[i];
			if(nm.equals(name)) {
				position=i;
				break;
			}
		}
		if(position==-1) {
			NameNotFoundException nx=new NameNotFoundException(name,"The entered name is not available");
			throw nx;
		}
		return position;
	}
}
