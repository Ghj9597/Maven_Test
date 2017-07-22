package cn.itclass.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itclass.dao.UserDao;
import cn.itclass.doman.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public List<User> findAll() {
		List<User> list =(List<User>)this.getHibernateTemplate().find("from User");
		return list;
	}

}
