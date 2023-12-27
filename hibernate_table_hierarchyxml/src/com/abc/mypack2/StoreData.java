package com.abc.mypack2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		
		 
		 Employee100 e1 = new Employee100();
		 Job100 e2 = new Job100();
		 Company100 e3 = new Company100();
		 
		 e2.setDesignation("Manager");
		 e2.setSalary(10000);
		 
		 e3.setCname("TCS");
		 e3.setLocation("Chennai");
		 
		 e1.setName("Ramesh");
		 
		 
	     
       
        session.save(e1);
        session.save(e2);
        session.save(e3);
	    t.commit();
        System.out.println("Successfully Saved");  
		factory.close();
        session.close();   
    }
}
