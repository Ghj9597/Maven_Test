package cn.itclass.Service.impl;

import java.util.List;

import cn.itclass.Service.UserService;
import cn.itclass.dao.UserDao;
import cn.itclass.doman.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public List<User> findAll(){
		List<User> list = userDao.findAll();
		return list;
	}
}
