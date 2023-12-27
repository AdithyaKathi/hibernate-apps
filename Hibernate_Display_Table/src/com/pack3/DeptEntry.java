package com.pack3;

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

public class DeptEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();
	    Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria cr = session.createCriteria(Dept.class);
		cr.add(Restrictions.gt("DEPTNO", 10));
		
		List l1 = cr.list();
		Iterator it = l1.iterator();
		
		while(it.hasNext()) {
			Dept d = (Dept)it.next();
			System.out.println(d.getDEPTNO()+"---"+d.getDNAME()+"---"+d.getLOC());
		}
		
		System.out.println("SUCCESS");
		factory.close();
        session.close();

	}

}
