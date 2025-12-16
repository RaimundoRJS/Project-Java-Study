package estudandoencapsulamento;

public class User {
	private String firstName;
	private String lastName;
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 
	
	public String outPut() {
		return firstName.toUpperCase() + " " + lastName.toUpperCase();
	}
	
	public String outPut(boolean showLastname) {
		if (showLastname) {
			return outPut();
		}else {
			return firstName.toUpperCase();
		}
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
