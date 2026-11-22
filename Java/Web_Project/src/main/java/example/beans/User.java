package example.beans;

public class User {
	
	private String userId;
	private String userPassword;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	

}
