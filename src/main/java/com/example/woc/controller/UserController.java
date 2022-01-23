package com.example.woc.controller;

import com.example.woc.entity.Account;
import com.example.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 01:22
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //这是一个示例,以POST方法提交数据


    /**
     * 完成注册功能
     * 选做：对密码进行加密处理
     * @param account
     */
    @PostMapping("/register")
    public void uploadUsername(Account account) {
        userService.uploadUsername(account);
    }

    /**
     * 完成登录功能
     * @param account
     */
    @PostMapping("/login")
    public boolean login(Account account) {
        int login = userService.login(account.getUsername(), account.getPassword());
        if (login == 1){
            return true;
        }
        else {
            return false;
        }
    }
}


