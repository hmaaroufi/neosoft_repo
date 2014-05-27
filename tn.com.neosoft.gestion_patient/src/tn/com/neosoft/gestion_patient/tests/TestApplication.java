package tn.com.neosoft.gestion_patient.tests;

import org.junit.Assert;
import org.junit.Test;

import tn.com.neosoft.gestion_patient.domaine.User;
import tn.com.neosoft.gestion_patient.services.impl.UserManagement;
import tn.com.neosoft.gestion_patient.services.interfaces.IUserManagement;

public class TestApplication {

	private IUserManagement iUserManagement;

	@Test
	public void testAddUuser() {
		User user = new User();
		user.setLogin("hma");
		user.setPassword("hma");

		UserManagement management=new UserManagement();
		Assert.assertTrue(management.addUser(user));

	}

}
