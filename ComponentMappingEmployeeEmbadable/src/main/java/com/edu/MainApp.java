package com.edu;

import java.util.Iterator;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
	

		Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();
		Address a= new Address("KARAIKAL","PONDICHERRY");
		Employee em= new Employee(23,"kalai",a);
	sess.save(em);
	t.commit();
	sess.close();
	
		
	}
}