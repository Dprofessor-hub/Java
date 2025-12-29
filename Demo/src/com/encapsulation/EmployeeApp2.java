package com.encapsulation;

public class EmployeeApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e = new Employee2(); // error because don't providing values to the constructor.
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
		Employee2 e1 = new Employee2(); // error because don't providing values to the constructor.
		System.out.println(e1.getEmpid());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

	}
}

class Employee2 extends Object{
	int Emp_id;
	String Name;
	int Salary;
	
	public Employee2(int Emp_id, String Name,int Salary) {
		super();
		this.Emp_id = Emp_id;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	
	public Employee2() {
		this(101, "arsh", 20);
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

