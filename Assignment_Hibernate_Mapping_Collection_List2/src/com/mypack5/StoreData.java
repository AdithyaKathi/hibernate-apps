package com.mypack5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*
;public class StoreData {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		
		 ArrayList<String> list1 = new ArrayList<>();
		 list1.add("TV");
		 list1.add("Laptop");
		 list1.add("Camera");
		 
		 ArrayList<String> list2 = new ArrayList<>();
		 list2.add("Mobile");
		 list2.add("PC");
		 list2.add("Watch");
		 
		 Product p1 = new Product();
		 p1.setCompany("Sony");
		 p1.setCost(93773.93);
		 p1.setPnames(list1);
		 
		 
		 Product p2 = new Product();
		 p2.setCompany("2. Samsung");
		 p2.setCost(84939.67);
		 p2.setPnames(list2);
		 
		 session.persist(p1);
		 session.persist(p2);
		 
	     t.commit();
         System.out.println("Successfully Saved");  
		 factory.close();
         session.close();   
    }
}
