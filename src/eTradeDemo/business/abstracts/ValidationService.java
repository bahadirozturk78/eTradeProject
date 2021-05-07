package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface ValidationService {

	boolean validate(User user);
}
