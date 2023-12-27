package com.pack2;

import java.util.Iterator;

import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		 SessionFactory factory = meta.getSessionFactoryBuilder().build();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		
		 TypedQuery query = session.createQuery("from Dept");
		 List<Dept> list = query.getResultList();
		 Iterator i = list.iterator();
		 
		 while(i.hasNext()) {
			 Dept d = (Dept)i.next();
			 System.out.println(d.getDEPTNO()+"---"+d.getDNAME()+"---"+d.getLOC());
		 }
		
		System.out.println("Saved Successfully");
		factory.close();
        session.close();

	}

}
