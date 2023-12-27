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
		
		 ArrayList<String> list2 = new ArrayList<>();
		 list2.add("Java Is A Platform");
		 list2.add("Java Is A Programming Language");
		 list2.add("Java Is A High-Level OOPS Language");
		 
		 ArrayList<String> list3 = new ArrayList<>();
		 list3.add("C Is The First Modern Programming Language");
		 list3.add("C Is A Low-Level Programming Language");
		 list3.add("C Is Invented In 70's");
		 
		 Question q = new Question();
		 q.setQname("1.What Is Java?");
		 q.setAnswers(list2);
		 
		 Question q2 = new Question();
		 q2.setQname("2.What Is C?");
		 q2.setAnswers(list3);
		 
		 session.save(q);
		 session.persist(q2);
		 
	     t.commit();
         System.out.println("successfully saved");  
		 factory.close();
         session.close();   
    }
}
