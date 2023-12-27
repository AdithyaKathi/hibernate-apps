package criteria.pack4;

import java.util.Iterator;

import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

public class EmpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();
	    Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria cr = session.createCriteria(EMPLOYE.class);
		cr.add(Restrictions.ilike("EMPNAME","S%"));
		List l1 = cr.list();
		int count = 0;
		Iterator it = l1.iterator();
		
		while(it.hasNext()) {
			EMPLOYE e = (EMPLOYE)it.next();
			System.out.println(e.getEMPID()+"---"+e.getEMPNAME()+"---"+e.getEMPJOB()+"---"+e.getEMPSAL()+"---"+e.getHIREDATE());
			count++;
		}
		
		System.out.println("SUCCESS");
		System.out.println(count+" RECORDS FOUND");
		factory.close();
        session.close();

	}

}
