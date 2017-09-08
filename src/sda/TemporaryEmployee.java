package sda;

public class TemporaryEmployee extends Employee{
	
	public TemporaryEmployee(double grossSalary, String mail) {
		super(grossSalary, mail);
	}

	@Override
	public double calculateNetSalary() {
		return 0.9 * getGrossSalary();
	}

}
