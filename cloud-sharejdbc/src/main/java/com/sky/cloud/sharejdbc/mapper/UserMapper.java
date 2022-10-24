package com.sky.cloud.sharejdbc.mapper;


import com.sky.cloud.sharejdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 通过ID 获取用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Long id);
}
