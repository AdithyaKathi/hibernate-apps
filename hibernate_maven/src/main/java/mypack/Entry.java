package mypack;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		
		Student s = new Student();
		s.setId(1);
		s.setFirstName("Adithya");
		s.setLastName("Kathi");
		
		s1.save(s);
		t.commit();
		
		System.out.println("Successfully Saved");
		sf.close();
		s1.close();
		
		

	}

}
