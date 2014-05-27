package tn.com.neosoft.gestion_patient.services.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.com.neosoft.gestion_patient.domaine.User;
import tn.com.neosoft.gestion_patient.jdbcUtil.HibernateUtil;
import tn.com.neosoft.gestion_patient.services.interfaces.IUserManagement;

public class UserManagement implements IUserManagement {

	private Session session;

	@Override
	public boolean addUser(User user) {
		session = HibernateUtil.getSession();
		boolean b = false;
		try {
			Transaction transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();

			b = true;

		} catch (Exception e) {
		}

		return b;
	}

}
