package com.encapsulation;


// local chaining 
public class LocalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e = new Employee3();

	}

}

class Employee3{
	int Emp_id;
	String Name;
	int Salary;
	
	public Employee3() {
		this(101,"Arsh",20);
		System.out.println("0 parameterize Constructor is called");
		}
	
	
	public Employee3(int emp_id) {
		System.out.println("1 parameterize Constructor is called");
	}
	
	public Employee3(int emp_id,String name) {
		this(101);
		System.out.println("2 parameterize Constructor is called");
	}
	
	public Employee3(int emp_id,String name,int Salary) {
		this(101,"Arsh");
		System.out.println("3 parameterize Constructor is called");
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
