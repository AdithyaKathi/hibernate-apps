package pack1;

import org.hibernate.*;
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
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setName("Adithya");
		e1.setName("Salaar");
		
		Address a1 = new Address();
		a1.setCity("Guntur");
		a1.setState("AP");
		a1.setCountry("India");
		a1.setPincode(522002);
		
		
		e1.setAd(a1);
		e2.setAd(a1);
		
		session.persist(e1);
		session.persist(e2);
		
		t.commit();
		
		System.out.println("Saved Successfully");
		factory.close();
		session.close();
		
	}

}
