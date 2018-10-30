package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/29.
 */

@Mapper
public interface UserDao {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User SelectUserById(@Param("id") Long id);
}
