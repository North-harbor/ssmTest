package com.hyj.mapper;

import com.hyj.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();
    List<User> findByName(User user);
    int deleteById(int id);
    int insertUser(User user);
    User selectById(User user);
    int updatById(User user);

}
