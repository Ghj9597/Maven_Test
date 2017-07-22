package cn.itclass.testdaimo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itclass.dao.UserDao;
import cn.itclass.doman.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_dao.xml")
public class UserTest {
	@Autowired
	private UserDao userDao;
	@Test
	public void userTest(){
		List<User> list = userDao.findAll();
		System.out.println(list.toString());
	}
}
