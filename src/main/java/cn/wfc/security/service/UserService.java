package cn.wfc.security.service;

import cn.wfc.security.bean.User;

public interface UserService {
    User findUserByName(String name);
}
