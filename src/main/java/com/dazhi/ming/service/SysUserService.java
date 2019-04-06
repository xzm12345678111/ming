package com.dazhi.ming.service;

import com.dazhi.ming.dao.SysUserMapper;
import com.dazhi.ming.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser get(String id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

}
