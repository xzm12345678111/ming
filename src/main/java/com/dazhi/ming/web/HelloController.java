package com.dazhi.ming.web;

import com.dazhi.ming.entity.SysUser;
import com.dazhi.ming.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    @RequestMapping("/user")
    public SysUser user() {
        return sysUserService.get("1");
    }
}