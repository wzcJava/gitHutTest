package demo.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import demo.domain.User;

public class UserDao extends HibernateDaoSupport{

	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}
	
}
