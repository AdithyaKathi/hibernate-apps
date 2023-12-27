package com.mypack4;

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
		
		Employee e = new Employee();
		Job j = new Job();
		Company c = new Company();
		
		e.setName("Gopi");
		j.setDesignation("Software Engineer");
		j.setSalary(24000);
		c.setCname("Tech Mahindra");
		c.setLocation("Hyderabad");
		
		session.persist(e);
		session.persist(j);
		session.persist(c);
		
		t.commit();
		System.out.println("Successfully Registered");
		
		factory.close();
		session.close();
	}

}
