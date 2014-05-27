package tn.com.neosoft.gestion_patient.services.interfaces;

import tn.com.neosoft.gestion_patient.domaine.User;

public interface IUserManagement {

	boolean addUser(User user);

	User findUserByID(int i);

	boolean deleteUserById(int i);

}
