package tn.com.neosoft.gestion_patient.tests;

import org.junit.Assert;
import org.junit.Test;

import tn.com.neosoft.gestion_patient.domaine.Patient;
import tn.com.neosoft.gestion_patient.services.LoginService;
import tn.com.neosoft.gestion_patient.services.ManagementPatient;

public class TestApplication {

	LoginService loginService = new LoginService();

	@Test
	public void testLoginService() {

		Assert.assertTrue(loginService.login("houda", "houda"));

	}

	@Test
	public void testAddPatient() {
		ManagementPatient managementPatient = new ManagementPatient();
		Patient patient=new Patient();
		patient.setId(1);
		patient.setLogin("houda");
		patient.setPassword("houda");
		patient.setRefDossier("patient1");

		
		Assert.assertTrue(managementPatient.addPatient(patient));

	}
}
