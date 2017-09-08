package sda;

public class Company {

	private Employee[] employees;
	private int index = 0;
	private Person[] allPeople;
	private int peopleIndex = 0;
	
	public Company(int numberOfEmployees){
		this.employees = new Employee[numberOfEmployees];
	}
	
	public void addEmployee(Employee employee){
		employees[index++] = employee;
	}
	
	public void addCustomer(Customer customer){
		allPeople[peopleIndex++] = customer;
	}
	
	public Employee[] getAllEmployees(){
		return employees;
	}
	
	public Person[] getAllPeople(){
		return allPeople;
	}
	
	public double sumOfSalaries(){
		double sum = 0;
		for(Employee employee : employees){
			if(employee == null){
				break;
			}
			sum += employee.calculateNetSalary();
		}
		return sum;
	}
	
	public double averageOfSalaries(){
		return sumOfSalaries() / index;
	}

	public double avgOfSalaries() {
		double sum = 0;
		for (int i = 0; i<employees.length; i++) {
			sum = sum + employees[i].calculateNetSalary();
		}
		return sum/employees.length;
	}
}
