package Practise;

public class MyException extends Exception{
	private String invalidName;

	public MyException(String invalidName , String errorMessage) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage()+":"+invalidName;
	}
}
