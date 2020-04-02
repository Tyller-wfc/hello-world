package cn.wfc.security.service;

import cn.wfc.security.bean.User;
import cn.wfc.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }
}
