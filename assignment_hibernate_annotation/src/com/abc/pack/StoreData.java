package com.abc.pack;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Product p = new Product();
		p.setP_id(2);
		p.setP_name("mouse");
		p.setP_price(300);
		
		session.save(p);
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
	}

}
