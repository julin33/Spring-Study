package com.julin.service;

import com.julin.dao.UserDao;
import com.julin.dao.UserDaoImpl;
import com.julin.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoOracleImpl(); //每次都要改Service的代码
    private UserDao userDao;

    //利用set进行动态是限制的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
