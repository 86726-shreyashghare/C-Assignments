package com.shreyash;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Shreyash","Ghare", 10000.0);
		emp.setSalary(emp.getSalary()*12);
		System.out.println("\n"+emp.toString());
		
		Employee emp1 = new Employee("Manish", "Karne",20000.0);
		emp1.setSalary(emp1.getSalary()*12);
		System.out.println("\n"+emp1.toString());
		
		System.out.println("\nSalary After 10% Hike - ");
		
		emp.setSalary(emp.getSalary()+emp.getSalary()*10/100);
		System.out.println("\nFirst Name = "+emp.getFirstName()+" , LastName = "+emp.getLastName()+" , Salary = "+emp.getSalary());
		
		emp1.setSalary(emp1.getSalary()+emp1.getSalary()*10/100);
		System.out.println("\nFirst Name = "+emp1.getFirstName()+" , LastName = "+emp1.getLastName()+" , Salary = "+emp1.getSalary());
		
	}
}
