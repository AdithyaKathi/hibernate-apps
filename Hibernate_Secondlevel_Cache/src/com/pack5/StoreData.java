package com.pack5;

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
		
		 Employee e1 = (Employee)session.load(Employee.class, 1);
		 System.out.println(e1.getId()+"---"+e1.getName()+"---"+e1.getSal());
		 
         System.out.println("successfully saved");  
		 factory.close();
         session.close();   
    }
}
