package cn.itlcass.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itclass.Service.UserService;
import cn.itclass.doman.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String findAll(){
		List<User> list = userService.findAll();
		ServletActionContext.getRequest().setAttribute("list",list);
		return SUCCESS;
	}
}
