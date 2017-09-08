package sda;

public class Main {

	public static void main(String[] args) {
		//komentarze ktore powinny byc usuniete poprzez zrewertowanie tego commita :)

		Employee temporaryEmployee = new TemporaryEmployee(1230, "maim@onet.pl");
		Employee fullTimeEmployee = new FullTimeEmployee(4000, "jerzy@interia.eu");
		
		Company myCompany = new Company(2);
		myCompany.addEmployee(temporaryEmployee);
		myCompany.addEmployee(fullTimeEmployee);
		
		System.out.println("Suma zarobkow: " + myCompany.sumOfSalaries());
		System.out.println("Średnia zarobków: " + myCompany.avgOfSalaries());
		
		

	}

}
