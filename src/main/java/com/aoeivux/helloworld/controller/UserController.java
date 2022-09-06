package com.aoeivux.helloworld.controller;


import com.aoeivux.helloworld.entity.User;
import com.aoeivux.helloworld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/select")
    public List<User> query(){
//        return usermapper.select(); // mybatis写法
        List<User> users = userMapper.selectList(null);//mp写法
        return users;

    }

    @PostMapping("/user/create")
    public String creteUser(User user){
//        int i = usermapper.create(user);
        int i = userMapper.insert(user);
        System.out.println(user.getId());
        if(i > 0 ){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }
}
