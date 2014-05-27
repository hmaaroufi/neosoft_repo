package tn.com.neosoft.gestion_patient.tests;

import org.hibernate.Session;

import tn.com.neosoft.gestion_patient.jdbcUtil.HibernateUtil;

public class SessionState {

	public static void main(String[] args) {
		Session session = HibernateUtil.getInstanceOf().getSession();
		Session session2 = HibernateUtil.getSession();

		System.out.println(session.hashCode());
		System.out.println(session2.hashCode());

	}

}
