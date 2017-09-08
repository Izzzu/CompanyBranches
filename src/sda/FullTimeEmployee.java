package sda;

public class FullTimeEmployee extends Employee{
	//komentarze ktore powinny byc usuniete poprzez zrewertowanie tego commita :)

	public static final double SOCIAL_INSURANCE = 1000;

	public FullTimeEmployee(double grossSalary, String mail) {
		super(grossSalary, mail);
	}

	@Override
	public double calculateNetSalary() {
		return 0.8 * (getGrossSalary() - SOCIAL_INSURANCE);
	}

}
