package sda;

public abstract class Employee implements Person{
	//komentarze ktore powinny byc usuniete poprzez zrewertowanie tego commita :)

	private double grossSalary;
	private String email;
	
	public Employee(double grossSalary, String email){
		this.grossSalary = grossSalary;
		this.email = email;
	}
	
	@Override
	public String getEmail(){
		return email;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}
	
	public abstract double calculateNetSalary();
}
