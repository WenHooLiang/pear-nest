package com.sakila.gencode.wuser.controller;


import com.sakila.gencode.wuser.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sakila
 * @since 2020-01-07
 */
@Api(description = "用户服务" ,value = "用户模块")
@RestController
@RequestMapping("/user")

public class UserController {

    @PostMapping("login")
    @ApiOperation("登陆")
    @ResponseBody
    public String login(User user) {
        System.out.println(user);
        return "OK";
    }

    @ApiOperation("注销")
    @GetMapping("logout")
    @ResponseBody
    public String logout() {
        return "OK";
    }
}
