package tn.com.neosoft.gestion_patient.tests;

import org.junit.Assert;
import org.junit.Test;

import tn.com.neosoft.gestion_patient.domaine.User;
import tn.com.neosoft.gestion_patient.services.impl.UserManagement;
import tn.com.neosoft.gestion_patient.services.interfaces.IUserManagement;

public class TestApplication {

	private IUserManagement iUserManagement = new UserManagement();;

	@Test
	public void testAddUser() {
		User user = new User();
		user.setLogin("hma");
		user.setPassword("hma");

		Assert.assertTrue(iUserManagement.addUser(user));

	}

	@Test
	public void testSearchUser() {
		User user = iUserManagement.findUserByID(1);
		Assert.assertEquals("hma", user.getLogin());

	}

	@Test
	public void testDeleteUser() {

		Assert.assertTrue(iUserManagement.deleteUserById(1));
	}
}
