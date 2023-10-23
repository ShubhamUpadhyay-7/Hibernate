package com.hibernate.Assignment1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        Transaction trx=session.beginTransaction();
        
        Employee emp1=new Employee();
        emp1.setName("Shubham Upadhyay");
        emp1.setDesignation("Project Engineer");
        emp1.setSalary(50000);
        
        Employee emp2=new Employee();
        emp2.setName("Pawan Gupta");
        emp2.setDesignation("Project Manager");
        emp2.setSalary(60000);
        
        Employee emp3=new Employee();
        emp3.setName("Deepansh Tiwarei");
        emp3.setDesignation("Associate Consultant");
        emp3.setSalary(70000);
        
        Employee emp4=new Employee();
        emp4.setName("Tanuj Kumar");
        emp4.setDesignation("Software Developer");
        emp4.setSalary(80000);
        
        Employee emp5=new Employee();
        emp5.setName("Shivam Upadhyay");
        emp5.setDesignation("CEO");
        emp5.setSalary(90000);
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(emp4);
        session.save(emp5);
        
        trx.commit();
        
        session.close();
        
        
    }
}
