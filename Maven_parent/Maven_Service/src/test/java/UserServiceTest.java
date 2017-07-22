import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itclass.Service.UserService;
import cn.itclass.doman.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext_Service.xml","classpath:applicationContext_dao.xml"})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	@Test
	public void name() {
		List<User> list = userService.findAll();
		System.out.println(list.toString());
	}
}
