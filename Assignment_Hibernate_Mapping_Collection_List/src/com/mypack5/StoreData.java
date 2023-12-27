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
		 list1.add("UHD");
		 list1.add("4K");
		 list1.add("Liquid Retina");
		 
		 ArrayList<String> list2 = new ArrayList<>();
		 list2.add("Serif");
		 list2.add("Galaxy TV");
		 list2.add("Android TV");
		 
		 TV t1 = new TV();
		 t1.setCompany("1. LG");
		 t1.setModels(list1);
		 
		 TV t2 = new TV();
		 t2.setCompany("2. Samsung");
		 t2.setModels(list2);
		 
		 session.save(t1);
		 session.persist(t2);
		 
	     t.commit();
         System.out.println("successfully saved");  
		 factory.close();
         session.close();   
    }
}
