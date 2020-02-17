package service.imp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserServiceDAO;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class UserServiceDAOImplTest {

    @Autowired
    UserServiceDAO userServiceDAO;

    @Test
    public void getAll(){
        System.out.println(userServiceDAO.getAll());
    }
}