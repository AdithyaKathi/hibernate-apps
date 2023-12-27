package com.anno.pack;

import java.util.*;
import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		
		Scanner scan = new Scanner(System.in);
	
		Employee1 e1 = new Employee1();
		System.out.println("Enter Employee Id : ");
		e1.setEmpid(scan.nextInt());
		System.out.println("Enter Employee Name : ");
		e1.setEmpname(scan.nextLine());
		System.out.println("Enter Employee Job : ");
		e1.setEmpjob(scan.nextLine());
		System.out.println("Enter Employee Salary : ");
		e1.setEmpsal(scan.nextDouble());
		
		
		session.save(e1);
		t.commit();
		System.out.println("Successfully Saved");
		
		
		factory.close();
		session.close();
	}

}
