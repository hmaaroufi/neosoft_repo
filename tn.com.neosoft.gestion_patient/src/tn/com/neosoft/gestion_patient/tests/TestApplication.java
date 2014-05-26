package tn.com.neosoft.gestion_patient.tests;

import org.junit.Assert;
import org.junit.Test;

import tn.com.neosoft.gestion_patient.domaine.Patient;
import tn.com.neosoft.gestion_patient.domaine.Personne;
import tn.com.neosoft.gestion_patient.services.LoginService;
import tn.com.neosoft.gestion_patient.services.ManagementPatient;

public class TestApplication {

	LoginService loginService = new LoginService();
	ManagementPatient managementPatient = new ManagementPatient();

	@Test
	public void testLoginService() {

		Assert.assertTrue(loginService.login("houda", "houda"));

	}

	@Test
	public void testAddPatient() {

		Patient patient = new Patient();
		patient.setId(1);
		patient.setLogin("houda");
		patient.setPassword("houda");
		patient.setRefDossier("patient1");

		Assert.assertTrue(managementPatient.addPatient(patient));

	}

	@Test
	public void testAddPersonne() {
		Personne personne = new Personne();
		personne.setName("houda new");
		Assert.assertTrue(managementPatient.addPersonne(personne));
	}
}
