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
		
		 
		 Set<String> set1 = new HashSet<>();
		 set1.add("Java Is A Programming Language");
		 set1.add("Java Is Written By James Gosling");
		 set1.add("Java Is An OOPS Language");
		 
		 Set<String> set2 = new HashSet<>();
		 set2.add("C Is A Programming Language");
		 set2.add("C Is A Procedural Language");
		 set2.add("C Is A Procedural Language");
		 
		 Set<String> set3 = new HashSet<>();
		 set3.add("Python Is A Programming Language");
		 set3.add("Python Is An Interpreted Language");
		 
		 Question q1 = new Question();
		 q1.setQname("1.What Is Java?");
		 q1.setAnswers(set1);
		 
		 Question q2 = new Question();
		 q2.setQname("2.What Is C?");
		 q2.setAnswers(set2);
		 
		 Question q3 = new Question();
		 q3.setQname("3.What Is Python?");
		 q3.setAnswers(set3);
		 
		 session.persist(q1);
		 session.persist(q2);
		 session.persist(q3);
		 
	     t.commit();
         System.out.println("Successfully Saved");  
		 factory.close();
         session.close();   
    }
}
