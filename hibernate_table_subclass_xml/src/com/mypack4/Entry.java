package com.mypack4;

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
		
		College s = new College();
		s.setCname("VVIT");
		
		Branch1 b1 = new Branch1();
		b1.setBid(101);
		b1.setBname("CSE");
		
		Branch2 b2 = new Branch2();
		b2.setBid2(102);
		b2.setBname2("IT");
		
		session.persist(s);
		session.persist(b1);
		session.persist(b2);
		
		t.commit();
		System.out.println("Successfully Saved");
		
		factory.close();
		session.close();
		
	}

}
