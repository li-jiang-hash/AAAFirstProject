package com.aaa.maven;

import com.aaa.project.dao.BaseDao;
import com.aaa.project.entity.User;
import org.junit.Test;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 19:48
 * @description: Exercise
 * @Version 1.0.0
 */
public class impTest {
    private BaseDao<User> baseDao = new BaseDao<>();
    @Test
    public void getSingleBean(){
        String sql ="select user_id userId,user_name userName,login_account loginAccount,login_password loginPassword from project_user where user_id=?";
        User user = baseDao.getSingleBean(sql, User.class, 1);
        System.out.println("emp="+user);
    }
}
