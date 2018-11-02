import com.ithuangqing.spring.dao.UserDao;
import com.ithuangqing.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");



        UserDao userdao = (UserDao) applicationContext.getBean("userdao");
        userdao.save();

    }
}
