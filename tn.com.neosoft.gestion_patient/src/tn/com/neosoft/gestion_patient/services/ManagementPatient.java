package tn.com.neosoft.gestion_patient.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import tn.com.neosoft.gestion_patient.domaine.Patient;
import tn.com.neosoft.gestion_patient.domaine.Personne;
import tn.com.neosoft.gestion_patient.jdbcUtil.MyConnectionMysql;

public class ManagementPatient {
	private Connection connection;
	private Statement statement;

	public void initConnection() {
		connection = MyConnectionMysql.configureConnection();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean addPatient(Patient patient) {

		return true;
	}

	public boolean addPersonne(Personne personne) {
		boolean b = false;
		try {
			initConnection();
			String sql = "insert into personne (namepersonne) values('"
					+ personne.getName() + "')";
			statement.executeUpdate(sql);
			b = true;
		} catch (Exception e) {
			System.err.println("pb ");
		}
		return b;
	}

}
