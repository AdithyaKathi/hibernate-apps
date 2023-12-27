package pack1;

import org.hibernate.*;
import java.util.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQname("1. What Is Java?");
		
		List<Answer> list1 = new ArrayList<>(); 
		Answer a1 = new Answer();
		a1.setAnswerName("Java Is A Programming Language");
		a1.setPostedBy("Salaar");
		Answer a2 = new Answer();
		a2.setAnswerName("Java Is An OOP's Language");
		a2.setPostedBy("Deva Shouryanga");
		
		list1.add(a1);
		list1.add(a2);
		q1.setAnswers(list1);
		
		session.persist(q1);
		t.commit();
		
		System.out.println("Saved Successfully");
		factory.close();
		session.close();
		
	}

}
