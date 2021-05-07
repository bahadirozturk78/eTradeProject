package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.AuthService;
import eTradeDemo.business.abstracts.ValidationService;
import eTradeDemo.entities.concretes.User;

public class EmailAuthManager implements AuthService{
	
	private ValidationService validationService;

	public EmailAuthManager() {
		this.validationService = new ValidationManager();
	}

	@Override
	public boolean register(User user) {
		if(validationService.validate(user)) {
			System.out.println("Ba�ar�yla kay�t oldunuz: " + user.getFirstName());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean login(User user) {
		System.out.println("Giri� yap�ld�.");
		return true;
	}

}
