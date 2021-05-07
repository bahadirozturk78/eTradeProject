package eTradeDemo;

import eTradeDemo.business.concretes.EmailAuthManager;
import eTradeDemo.business.concretes.UserManager;
import eTradeDemo.dataAccess.concretes.HibernateUserDao;
import eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User baho = new User(1,"Bahadýr","Öztürk","bahadir@gmail.com","123456");
		UserManager manager = new UserManager(new EmailAuthManager(),new HibernateUserDao());
		
		manager.signUp(baho);
		manager.signIn(baho);

	}

}
