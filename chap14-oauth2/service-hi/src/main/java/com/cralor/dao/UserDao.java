package com.cralor.dao;

import com.cralor.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cc.
 * 2018/8/6 17:08
 **/
public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
