package com.personnel.dao;

/**
 * 用于登录操作的service类
 * @author zhouzhenjiang
 *
 */
public interface ILoginDao {
     
    /**
     * 用来判断用户的密码和用户名是否正确
     * @param email
     * @param password
     * @return
     */
    public int confirmUser(String email,String password);
    
    /**
     * 判断是否存在于数据库中
     * @param email
     * @return
     */
    public int isExist(String email);
}
