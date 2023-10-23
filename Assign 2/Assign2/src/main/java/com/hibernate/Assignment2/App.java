package com.hibernate.Assignment2;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        try {
        	Transaction trx=session.beginTransaction();
        	Employee emp1=new Employee();
        	emp1.setEmpName("Shivam Upadhyay");
        	emp1.setEmpAge(20);
        	emp1.setEmpDOB(new Date(2002,06,01));
        	emp1.setEmpDesignation("SE");
        	emp1.setEmpJOD(new Date(2023,10,23));
        	emp1.setEmpBasic_Pay(100000.67);
        	
        	Employee emp2=new Employee();
        	emp2.setEmpName("Kanan Verma");
        	emp2.setEmpAge(23);
        	emp2.setEmpDOB(new Date(2000,06,01));
        	emp2.setEmpDesignation("SS");
        	emp2.setEmpJOD(new Date(2023,10,23));
        	emp2.setEmpBasic_Pay(50000.32);
        	
        	session.save(emp1);
        	session.save(emp2);
        	
        	//
        	Employee empToDelete=session.get(Employee.class,4);
        	System.out.println(empToDelete);
        	session.delete(empToDelete);
        	
        	EmployeeLogTab employeeLog=new EmployeeLogTab();
        	employeeLog.setEmpCode(empToDelete.getEmpCode());
        	employeeLog.setName(empToDelete.getEmpName());
        	employeeLog.setDesignation(empToDelete.getEmpDesignation());
        	employeeLog.setLastDrawnSalary(empToDelete.getEmpBasic_Pay());
        	employeeLog.setLeavingDate(new Date(2099,01,06));
        	
        	session.save(employeeLog);
        	
        	trx.commit();
        	
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
        finally {
        	session.close();
        }
    }
}
