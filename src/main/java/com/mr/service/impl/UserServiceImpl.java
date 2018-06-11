package com.mr.service.impl;

import com.mr.model.User;
import com.mr.repository.UserRepository;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2018/6/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public Iterable<User> findAll() {
        Iterable<User> all = userRepository.findAll();
        return all;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void del(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public User update(User user) {
        User save = userRepository.save(user);
        return save;
    }


}
