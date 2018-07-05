package com.jiyongjun.tao.common.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiyongjun.tao.common.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/2 17:39
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping("/save")
    public User save(User user) {
        System.out.println("保存用户" + user.toString());
        return user;
    }
    @RequestMapping("/h")
    public String index() {
        return "hello";
    }
}
