package com.hibernate.Assignment3;

import java.util.HashMap;
import java.util.Map;

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
        SessionFactory sessionFactory=new Configuration().configure("com/hibernate/Assignment3/hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        Transaction trx=session.beginTransaction();
        
        Continent continent=new Continent();
        continent.setCname("Asia");
        
        Country India=new Country();
        India.setCountryName("India");
        
        Capital Delhi=new Capital();
        Delhi.setCapitalName("Delhi");
        
        session.save(India);
        session.save(Delhi);
        
        Map<Country,Capital> details=new HashMap<>();
        details.put(India, Delhi);
        
        continent.setCountries(details);
        
        session.save(continent);
        System.out.println(continent.getCname());
        System.out.println(continent.getCountries());
        
        trx.commit();
        
        session.close();
        
        
    }
}
