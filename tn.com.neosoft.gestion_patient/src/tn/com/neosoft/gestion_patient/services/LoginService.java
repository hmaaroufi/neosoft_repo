package tn.com.neosoft.gestion_patient.services;

public class LoginService {

	public boolean login(String login, String password) {
		boolean b = false;
		
		if (login.equals("houda")&& password.equals("houda")){
			b=true;
		}

		return b;
	}
	
	
}
