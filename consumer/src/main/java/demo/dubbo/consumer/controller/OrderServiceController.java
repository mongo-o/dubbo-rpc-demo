package demo.dubbo.consumer.controller;

import demo.ayl.dubbo.provider.api.UserServiceI;
import demo.ayl.dubbo.provider.dao.User;
import demo.dubbo.consumer.interceptor.NeedLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author AYL    2018/9/12 17:12
 */
@Controller
@ResponseBody
@RequestMapping("/order")
public class OrderServiceController {

    @Autowired
    private UserServiceI userServiceImpl;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @NeedLogin(true)
    public String test(@RequestBody User user) {
        return userServiceImpl.testUser(user);
    }


}
