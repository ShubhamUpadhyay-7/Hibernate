package com.hibernate.Assignment4;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
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
        
        Car car1=new Car();
        car1.setRegNo("KL-07 AB 123");
        car1.setManufacturer("Volkswagen");
        car1.setModel("Polo");
        car1.setColour("White");
        car1.setPrice(700000);
        
        Car car2=new Car();
        car2.setRegNo("KL-07 AB 234");
        car2.setManufacturer("Volkswagen");
        car2.setModel("Vento");
        car2.setColour("Black");
        car2.setPrice(600000);
        
        Car car3=new Car();
        car3.setRegNo("KL-07 BC 123");
        car3.setManufacturer("Chevrolet");
        car3.setModel("Sail Uva");
        car3.setColour("Red");
        car3.setPrice(500000);
        
        Car car4=new Car();
        car4.setRegNo("KL-07 AC 345");
        car4.setManufacturer("Toyota");
        car4.setModel("Corolla ");
        car4.setColour("Silver");
        car4.setPrice(1000000);
        
        session.save(car1);
        session.save(car2);
        session.save(car3);
        session.save(car4);
        
        System.out.println("Question 1:");
        
        String hql1="FROM Car";
        List<Car> cars1=session.createQuery(hql1,Car.class).getResultList();
        
        System.out.println("List of Cars:");
        for(Car car:cars1) {
        	System.out.println(car);
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Question 2:");
        
        String hql2="Select DISTINCT car.Manufacturer FROM Car car WHERE car.Manufacturer Like 'V%'";
        List<String> manufacturers=session.createQuery(hql2,String.class).getResultList();
        
        System.out.println("Car Manufacturers name starting with V:");
        for(String manufacturer:manufacturers) {
        	System.out.println(manufacturer);
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Question 3:");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Registration number");
        String RegistrationNumber=sc.nextLine();
        
        String hql3="From Car Where RegNo=:regNo";
        Car car=session.createQuery(hql3,Car.class).setParameter("regNo",RegistrationNumber).uniqueResult();
        
        if(car!=null) {
        	System.out.println(car);
        }
        else {
        	System.out.println("No Car Exist With This Registration Number");
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Question 4:");
        
        String hql4="From Car car Where car.Price < 600000";
        List<Car> cars4=session.createQuery(hql4,Car.class).getResultList();
        
        for(Car car5:cars4) {
        	System.out.println(car5);
        }
        
        System.out.println("-------------------------------------");
        
        
        trx.commit();
        session.close();
    }
}
