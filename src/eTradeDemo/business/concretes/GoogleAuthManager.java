package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.AuthService;
import eTradeDemo.entities.concretes.User;

public class GoogleAuthManager implements AuthService{

	@Override
	public boolean register(User user) {
		System.out.println("Google ile kayýt oldu: " + user.getFirstName());
		return true;
	}

	@Override
	public boolean login(User user) {
		System.out.println("Google ile giriþ yapýldý: " + user.getFirstName());
		return true;
	}

}
