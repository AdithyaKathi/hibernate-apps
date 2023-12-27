package com.mypack5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*
;public class Test {

	public static void main( String[] args )
    {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();
	    Session session = factory.openSession();
	    Transaction t = session.beginTransaction();
	    
	    Answer a = new Answer();
	    Answer a2 = new Answer();
	    Question q = new Question();
	    
	    a.setAnswerName("Java Is A Programming Language");
	    a.setPostedBy("Adithya");
	    
	    a2.setAnswerName("Java Is A Platform");
	    a2.setPostedBy("Adithya");
	      
	    q.setQname("What is Java?");  
	    List<Answer> l = new ArrayList<Answer>();  
	    l.add(a);  
	    l.add(a2);
	    q.setAnswers(l);
	    
	    session.persist(q);
        
	    t.commit();
	    
	    System.out.println("Successfully Saved");
	    
	    factory.close();
	    session.close();   
    }
}
