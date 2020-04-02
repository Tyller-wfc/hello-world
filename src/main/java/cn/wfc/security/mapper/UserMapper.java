package cn.wfc.security.mapper;

import cn.wfc.security.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserByName(String name);
}
