import com.gq.base.user.model.User;
import com.gq.base.user.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by ZSL on 2017/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestMyBatis {
    @Resource(name="userService")
    private IUserService userService;

    @Test
    public void test(){
        User user = userService.getUserByID(1L);
        System.out.println(user.getName());
    }
}
