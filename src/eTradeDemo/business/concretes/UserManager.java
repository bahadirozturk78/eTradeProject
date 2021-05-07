package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.AuthService;
import eTradeDemo.business.abstracts.UserService;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class UserManager implements UserService {

	private AuthService authService;
	private UserDao userDao;

	public UserManager(AuthService authService, UserDao userDao) {
		this.authService = authService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		boolean isAddable = this.authService.register(user);	
		if(isAddable) {
			this.userDao.add(user);
		}
	}

	@Override
	public void signIn(User user) {
		this.authService.login(user);
		
	}
	
	

}
