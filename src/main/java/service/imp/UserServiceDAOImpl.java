package service.imp;

import org.springframework.stereotype.Service;
import po.User;
import service.UserServiceDAO;

@Service
public class UserServiceDAOImpl implements UserServiceDAO {
    //shift+ctrl+t
    public User getAll() {
        User user=new User();
        user.setId(12);
        user.setName("zhangsan");
        return user;
    }
}
