package sda;

public class Customer implements Person{
	//komentarze ktore powinny byc usuniete poprzez zrewertowanie tego commita :)

	private String email;
	
	public Customer(String email){
		this.email = email;
	}
	
	@Override
	public String getEmail() {
		return email;
	}

}
