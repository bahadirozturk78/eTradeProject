package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface AuthService {

	boolean register(User user);

	boolean login(User user);

}
