package com.aoeivux.helloworld.mapper;

import com.aoeivux.helloworld.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
//使用MybatisPlus写法，继承BaseMapper
public interface UserMapper extends BaseMapper<User> {
//Mybatis写法
//    @Select("select * from user")
//    List<User> select();
//    @Insert("Insert into user values (#{id}, #{name}, #{birthday})")
//    int create(User user);

}
