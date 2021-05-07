package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.AuthService;
import eTradeDemo.entities.concretes.User;

public class GoogleAuthManager implements AuthService{

	@Override
	public boolean register(User user) {
		System.out.println("Google ile kay�t oldu: " + user.getFirstName());
		return true;
	}

	@Override
	public boolean login(User user) {
		System.out.println("Google ile giri� yap�ld�: " + user.getFirstName());
		return true;
	}

}
