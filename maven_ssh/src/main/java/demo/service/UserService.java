package demo.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import demo.dao.UserDao;
import demo.domain.User;
@Transactional
public class UserService {
	@Resource(name="userDao")
	private UserDao dao;

	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}
}
