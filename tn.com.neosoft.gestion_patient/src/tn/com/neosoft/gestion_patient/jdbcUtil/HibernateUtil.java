package tn.com.neosoft.gestion_patient.jdbcUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	public static Session getSession() {

		if (session == null) {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}

}
