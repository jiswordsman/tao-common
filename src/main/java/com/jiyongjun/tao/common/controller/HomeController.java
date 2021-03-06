package com.jiyongjun.tao.common.controller;

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
        //language=MySQL
        String json = "select * from t_user";
        if (json != null) {
            
        }
        return "index3";
    }

    @GetMapping("/assembly")
    public String assembly() {
        return "assembly";
    }
    @GetMapping("/assembly2")
    public String assembly2() {
        return "assembly2";
    }
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello Spring boot";
    }
}
