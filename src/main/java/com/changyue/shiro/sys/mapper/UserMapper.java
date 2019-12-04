package com.changyue.shiro.sys.mapper;

import com.changyue.shiro.sys.model.User;
import com.changyue.shiro.sys.model.UserExample;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * @param id
     * @return
     */
    Set<String> selectUerRoleNameSet(Integer id);

    /**
     * @param id
     * @return
     */
    Set<String> selectUserPermissionNameSet(Integer id);

}