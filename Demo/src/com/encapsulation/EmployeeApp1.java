package com.encapsulation;


public class EmployeeApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1(); // error because don't providing values to the constructor.
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());


	}

}

class Employee1 extends Object{
	int Emp_id;
	String Name;
	int Salary;
	
	public Employee1(int Emp_id, String Name,int Salary) {
		super();
		this.Emp_id = Emp_id;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	public int getEmpid() {
		return Emp_id;
	}
	
	public String getName() {
		return Name;
	}
	public int getSalary() {
		return Salary;
	}
}

