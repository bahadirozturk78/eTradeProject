package eTradeDemo.dataAccess.concretes;

import java.util.List;

import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi!");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
