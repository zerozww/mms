package com.test.mms.controller;


import com.test.mms.dao.UserMapper;
import com.test.mms.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "pic")
    public User pic() {
        //调用dao层
        User user = userMapper.selectUserByName("Bryan");
        return user;
    }

}
