package sda;

public class TemporaryEmployee extends Employee{
	//komentarze ktore powinny byc usuniete poprzez zrewertowanie tego commita :)

	public TemporaryEmployee(double grossSalary, String mail) {
		super(grossSalary, mail);
	}

	@Override
	public double calculateNetSalary() {
		return 0.9 * getGrossSalary();
	}

}
