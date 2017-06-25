package demo.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import demo.domain.User;
import demo.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	@Resource(name="userService")
	private UserService service;
	
	public String save(){
		
		service.save(user);
		return SUCCESS;
	}
}
