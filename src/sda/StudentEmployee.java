package sda;

public class StudentEmployee extends Employee{
	
	public StudentEmployee(double grossSalary, String mail) {
		super(grossSalary, mail);
	}

	@Override
	public double calculateNetSalary() {
		return 0.95 * getGrossSalary();
	}

}
