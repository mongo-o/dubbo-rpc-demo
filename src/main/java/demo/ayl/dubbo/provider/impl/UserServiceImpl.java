package demo.ayl.dubbo.provider.impl;

import demo.ayl.dubbo.provider.api.UserServiceI;
import demo.ayl.dubbo.provider.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author AYL    2018/9/12 16:22
 */
@Service
public class UserServiceImpl implements UserServiceI {

    public String testUser(User user){
        System.out.println("======testUser()===========");
        return user.getName();
    }
}
