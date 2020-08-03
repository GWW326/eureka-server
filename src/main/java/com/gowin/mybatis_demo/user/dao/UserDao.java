package com.gowin.mybatis_demo.user.dao;

import com.gowin.mybatis_demo.user.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select *  from user")
    @Result(property = "phoneNumber",column = "phone_number")
    List<User> findAll();
    @Insert("insert into user values(null,#{name},#{password},#{phoneNumber})")
    void addUser( User user);

}
