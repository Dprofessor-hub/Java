package com.encapsulation;

class Employee extends Object{
	int Emp_id;
	String Name;
	int Salary;
	
	public Employee(int Emp_id, String Name,int Salary) {
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


public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101,"Arsh",20);
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
