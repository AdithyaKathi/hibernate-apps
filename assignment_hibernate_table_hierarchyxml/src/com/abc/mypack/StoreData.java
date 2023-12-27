package com.abc.mypack;

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
		
		Account a1 = new Account();
		CreditCard a2 = new CreditCard();
		DebitCard a3 = new DebitCard();
		GoldLoan a4 = new GoldLoan();
		HouseLoan a5 = new HouseLoan();
		
		a1.setName("Anudeep");
		a2.setCbalance(75000);
		a3.setDbalance(7890);
		a4.setLoanamount(928392);
		a5.setLoanemi(30000);
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		session.save(a5);
		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
		
		
	}
	
	
}