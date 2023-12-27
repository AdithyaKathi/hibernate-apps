package com.mypack;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class Employee1DAO {
	
	public static int register(Employee1 e1) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		int i = (Integer)session.save(e1);
		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
		
		return i;		
	}
}
