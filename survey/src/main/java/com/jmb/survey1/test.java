package com.jmb.survey1;

import org.hibernate.Session;

import com.jmb.survey1.utilities.HibernateUtil;

public class test {
	private Session session;
	
	public void xxx() {
			session=HibernateUtil.getSessionFactory().openSession();
			
	}

}
