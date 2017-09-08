package sda;

import java.util.LinkedList;
import java.util.List;

public class Company {
	private List<Employee> employees;
	
	public Company(){
		this.employees = new LinkedList<>();
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public double sumOfSalaries() {
		double sumOfSalaries = 0;
		for(Employee e: employees) {
			sumOfSalaries += e.calculateNetSalary();
		}
		return sumOfSalaries;
	}
	
	public double avgOfSalaries() {
		int size = employees.size();
		return (sumOfSalaries()/size);
	}
	

}
