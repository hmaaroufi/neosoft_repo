package tn.com.neosoft.gestion_patient.services.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tn.com.neosoft.gestion_patient.domaine.User;
import tn.com.neosoft.gestion_patient.jdbcUtil.HibernateUtil;
import tn.com.neosoft.gestion_patient.services.interfaces.IUserManagement;

public class UserManagement implements IUserManagement {

	private Session session = HibernateUtil.getSession();

	@Override
	public boolean addUser(User user) {
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

	@Override
	public User findUserByID(int i) {
		User user = new User();
		try {
			Transaction transaction = session.beginTransaction();
			session.load(user, i);
			transaction.commit();

		} catch (Exception e) {
		}

		return user;
	}

	@Override
	public boolean deleteUserById(int i) {
		boolean b = false;
		try {

			Transaction transaction = session.beginTransaction();
			session.delete(findUserByID(i));
			transaction.commit();
			b = true;
		} catch (Exception e) {
		}

		return b;
	}

}
