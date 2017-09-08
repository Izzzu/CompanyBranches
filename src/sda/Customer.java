package sda;

public class Customer implements Person{

	private String email;
	
	public Customer(String email){
		this.email = email;
	}
	
	@Override
	public String getEmail() {
		return email;
	}

}
