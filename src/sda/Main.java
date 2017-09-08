package sda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Employee student = new StudentEmployee(800, "jan.k@gmail.com");
		Employee temporaryEmployee = new TemporaryEmployee(1230, "maim@onet.pl");
		Employee fullTimeEmployee = new FullTimeEmployee(4000, "jerzy@interia.eu");
		
		Company myCompany = new Company();
		myCompany.addEmployee(student);
		myCompany.addEmployee(temporaryEmployee);
		myCompany.addEmployee(fullTimeEmployee);
		
		System.out.println("Suma zarobkow: " + myCompany.sumOfSalaries());
		System.out.println("Średnia zarobków: " + myCompany.avgOfSalaries());
		
		

	}

}
