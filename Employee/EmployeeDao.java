package com.myapp.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.myapp.model.Employee;


public class EmployeeDao {
	SessionFactory factory=null;
public EmployeeDao() {
	// TODO Auto-generated constructor stub
	factory=new Configuration().configure().buildSessionFactory();
}
public String generateEmployeeId(String fname,String lname){
String employeeId="";
String seqNum="";
int seqNumber=0;
try{
String sql="select seqplayer.nextval from dual";


Session session= factory.openSession();
Query query=session.createSQLQuery(sql);

seqNumber=Integer.parseInt(query.getSingleResult().toString());

if(seqNumber < 100 && seqNumber >=10)
seqNum="0"+seqNumber;
else if(seqNumber<10)
seqNum="00"+seqNumber;
else
seqNum=""+seqNumber;

employeeId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

return employeeId;
}
catch (Exception e) {
e.printStackTrace();
}

return "";
}
public String saveEmployee(Employee employee) {
	
try {	
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		employee.setEmployee_Id(generateEmployeeId(employee.getEmployee_First_Name(),employee.getEmployee_Second_Name()));

		//System.out.println(employee.getEmpId());

		session.save(employee);
		tx.commit();
		return "employee created";
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		factory.close();
		}
	
	return "cannot save employee";
	}
public List<Employee> getAllEmployee()
{
	try {	
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		ArrayList<Employee>employee=(ArrayList<Employee>)session.createQuery("from Employee").list();
		tx.commit();
		return employee;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		factory.close();
		}
	
	return null;
}
public ArrayList<Employee> getAllEmployeeWhereCityStartsWithB()
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
ct.add(Restrictions.like("Employee_City", "B%"));
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}
public ArrayList<Employee> getTop5EmployeeByMaxAge()
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
ct.addOrder(Order.desc("Employee_Age"));//.add(Restrictions.like("Employee_City", "B%"));
ct.setMaxResults(5);
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}
public ArrayList<Employee> getTop5Employee()
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
//ct.addOrder(Order.desc("Employee_Age"));//.add(Restrictions.like("Employee_City", "B%"));
ct.setMaxResults(5);
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}


public ArrayList<Employee> getAllEmployeeWhereCityAndAgeGreaterThan40(String city,int age)
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
ct.add(Restrictions.conjunction().add(Restrictions.like("Employee_City", "%"+city+"%").ignoreCase()).add(Restrictions.gt("Employee_Age", age)));
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}

public ArrayList<Employee> getAllEmployeeWhereDeptAndAgeGreaterThan40(String dept,int age)
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
ct.add(Restrictions.conjunction().add(Restrictions.like("Employee_Department", "%"+dept+"%").ignoreCase()).add(Restrictions.gt("Employee_Age", age)));
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}

public ArrayList<Employee> getAllEmployeeByTwoDept(String dept1,String dept2)
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();


Criteria ct=session.createCriteria(Employee.class);
ct.add(Restrictions.disjunction().add(Restrictions.like("Employee_Department", "%"+dept1+"%").ignoreCase()).add(Restrictions.like("Employee_Department", "%"+dept2+"%").ignoreCase()));
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}



public ArrayList<Employee> getAllEmployeeAgeGreaterThan40()
{
try
{
Session session= factory.openSession();
Transaction tx=session.beginTransaction();

Criteria ct=session.createCriteria(Employee.class);
ct.add(Restrictions.gt("Employee_Age", 40));
ArrayList<Employee> employee=(ArrayList<Employee>)ct.list();

//ArrayList<Employee> employee=(ArrayList<Employee>)ct.add(Restrictions.gt("Employee_Age", 40)).list();

tx.commit();
return employee;
}
catch (Exception e) {
e.printStackTrace();
}
finally {
factory.close();
}

return null;

}




/*
public String saveEmployee(Employee employee)
{

try
{
Session session= factory.openSession();

Transaction tx= session.beginTransaction();
employee.setEmpId(generateEmployeeId(employee.getFirstName(),employee.getLastName()));

//System.out.println(employee.getEmpId());

session.save(employee);
tx.commit();
return "employee saved";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create employee";
}
*/

}




	