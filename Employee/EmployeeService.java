package com.myapp.service;

import java.util.ArrayList;

import com.myapp.dao.EmployeeDao;
import com.myapp.model.Employee;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee employee=new Employee(40,"Bangalore","HR","Sharmila","Annadurai","");
		EmployeeDao dao=new EmployeeDao();
		System.out.println(dao.saveEmployee(employee));
		*/
/*		EmployeeDao dao=new EmployeeDao();
		ArrayList<Employee> employee =(ArrayList<Employee>) dao.getAllEmployee();
		for(Employee employee1:employee) {
			System.out.println(employee1);
			}
*/
		/*EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getAllEmployeeAgeGreaterThan40();

		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
*/
		/*EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getAllEmployeeWhereCityStartsWithB();

		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
*/	
/*		EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getAllEmployeeWhereCityAndAgeGreaterThan40("Bangalore", 40);
		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
*/
		/*EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getAllEmployeeWhereDeptAndAgeGreaterThan40("Sales", 40);
		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
*/
		/*EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getAllEmployeeByTwoDept("Sales", "HR");
		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
*/
		/*EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getTop5EmployeeByMaxAge();
		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }*/
		EmployeeDao dao=new EmployeeDao();
		 ArrayList<Employee> employee=(ArrayList<Employee>)dao.getTop5Employee();
		 for(Employee employee1:employee){
		 System.out.println(employee1);
		 }
		
	}

}
