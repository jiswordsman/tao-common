package com.jiyongjun.tao.common.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiyongjun.tao.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/2 18:04
 */
@Controller
public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
    @GetMapping("/index3")
    public String index3() {
        return "index3";
    }
    
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello Spring boot";
    }
}
