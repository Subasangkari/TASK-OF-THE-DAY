package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Table(name="Employee_Details")
@Entity
public class Employee {
	@Id
	String Employee_Id;
	String Employee_First_Name;
	String Employee_Second_Name;
	String Employee_City;
	int Employee_Age;
	String Employee_Department;// -- sales / marketing / It /Hr
	public Employee(int employee_Age,String employee_City,String employee_Department,String employee_First_Name, String employee_Second_Name, 
			String employee_Id) {
		super();
		Employee_Id = employee_Id;
		Employee_First_Name = employee_First_Name;
		Employee_Second_Name = employee_Second_Name;
		Employee_City = employee_City;
		Employee_Age = employee_Age;
		Employee_Department = employee_Department;
	}
	public String getEmployee_Second_Name() {
		return Employee_Second_Name;
	}
	public void setEmployee_Second_Name(String employee_Second_Name) {
		Employee_Second_Name = employee_Second_Name;
	}
	public void setEmployee_First_Name(String employee_First_Name) {
		Employee_First_Name = employee_First_Name;
	}
	public String getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getEmployee_First_Name() {
		return Employee_First_Name;
	}
	public void setEmployee_Name(String employee_First_Name) {
		Employee_First_Name = employee_First_Name;
	}
	public String getEmployee_City() {
		return Employee_City;
	}
	public void setEmployee_City(String employee_City) {
		Employee_City = employee_City;
	}
	public int getEmployee_Age() {
		return Employee_Age;
	}
	public void setEmployee_Age(int employee_Age) {
		Employee_Age = employee_Age;
	}
	public String getEmployee_Department() {
		return Employee_Department;
	}
	public void setEmployee_Department(String employee_Department) {
		Employee_Department = employee_Department;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Employee_Id=" + Employee_Id + ", Employee_First_Name=" + Employee_First_Name
				+ ", Employee_Second_Name=" + Employee_Second_Name + ", Employee_City=" + Employee_City
				+ ", Employee_Age=" + Employee_Age + ", Employee_Department=" + Employee_Department + "]";
	}
	
	
}
