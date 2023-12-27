package com.abc.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.abc.pack.College;
import com.abc.pack.Student;
import com.abc.pack.Faculty;
import com.abc.pack.Library;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		College c1 = new College();
		Student c2 = new Student();
		Faculty c3 = new Faculty();
		Library c4 = new Library();
		
		c1.setName("VVIT");
		
		c2.setName("Balu Sandeep");
		c2.setStd("B.Tech");
		c2.setCgpa(8.2f);
		
		c3.setName("Prashanth");
		c3.setSubject("Java");
		c3.setSalary(35000);
		
        c4.setName("Java 8 Standard Edition");
		c4.setBookPrice(1099);
		
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
	}

}
