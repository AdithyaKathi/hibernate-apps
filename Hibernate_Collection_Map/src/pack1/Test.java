package pack1;
import java.util.*;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import pack1.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		
		 
		 Map<String,String> map1 = new HashMap<>();
		 map1.put("Java Is A Programming Language", "Adithya");
		 map1.put("Java IS An OOPS Language", "PrithviRaj");
		 map1.put("Java Is A Platform", "Raj");
		 
		 Map<String,String> map2 = new HashMap<>();
		 map2.put("C Is Written By Dennis Ritchie","Ranbir");
		 map2.put("C Is A Procedural Programming Language", "Robin");
		 
		 
		 Question q1 = new Question();
		 q1.setQname("1.What Is Java?");
		 q1.setName("Prashant Atmakuri");
		 q1.setAnswers(map1);
		 
		 Question q2 = new Question();
		 q2.setQname("2.What Is C?");
		 q2.setName("Hari Prasad Chandika");
		 q2.setAnswers(map2);
		 
		 session.persist(q1);
		 session.persist(q2);
		 
	     t.commit();
         System.out.println("Successfully Saved");  
		 factory.close();
         session.close();
	}

}
