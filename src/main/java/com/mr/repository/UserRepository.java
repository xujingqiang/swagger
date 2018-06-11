package com.mr.repository;

import com.mr.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/6/11.
 */
public interface UserRepository extends CrudRepository<User,Integer> {
}
