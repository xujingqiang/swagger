package com.mr.service;

import com.mr.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
public interface UserService {

    Iterable<User> findAll();

    void save(User user);

    void del(Integer id);

    User update(User user);
}
