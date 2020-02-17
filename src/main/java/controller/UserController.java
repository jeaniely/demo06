package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.User;
import service.UserServiceDAO;

@Controller
public class UserController {

    @Autowired
    UserServiceDAO userServiceDAO;

    @RequestMapping("index01")
    @ResponseBody
    public User getAll(){
        return userServiceDAO.getAll();
    }

    @RequestMapping("user")
    public String user(){
        return "user";
    }
}
