package com.abc.pack;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class ProductDAO {
	
	public static int register(Product p) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		int i = (Integer)session.save(p);
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
		
		return i;
	}
}
