package com.oop.java;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEmpId(1037556);
		e1.setEmpName("Avanish");
		
		System.out.println(e1.getEmpName() + " id is "+ e1.getEmpId());
	}

}


class Employee 
{
	// encapsulation is data hiding
	// set data to private and use setters to set the value anf getters to get the value
	private int empId ;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}