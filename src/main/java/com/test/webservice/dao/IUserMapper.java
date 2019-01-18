package com.test.webservice.dao;

import com.test.webservice.model.UserBean;

import java.util.List;

public interface IUserMapper {
    /**
     * 新增用戶
     */
    int insertUser(UserBean user) throws Exception;

    /**
     * 修改用戶
     */
    int updateUser(UserBean user, int id) throws Exception;

    /**
     * 刪除用戶
     */
    int deleteUser(int id) throws Exception;

    /**
     * 根据id查询用户信息
     */
    UserBean selectUserById(int id) throws Exception;

    /**
     * 查询所有的用户信息
     */
    List<UserBean> selectAllUser() throws Exception;
}
