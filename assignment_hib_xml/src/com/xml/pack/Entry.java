package com.xml.pack;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Student1 s = new Student1();
		s.setNo(1);
		s.setName("Adithya");
		s.setMarks(94);
		session.save(s);
		t.commit();
		System.out.println("Successfully Saved");
		
		factory.close();
		session.close();
		
	}

}
