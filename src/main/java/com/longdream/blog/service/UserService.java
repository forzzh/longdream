package com.longdream.blog.service;

import com.longdream.blog.mapper.UserMapper;
import com.longdream.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaozhihang
 * @date 2017/5/16
 */
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
