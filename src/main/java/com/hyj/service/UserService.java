package com.hyj.service;

import com.hyj.mapper.UserMapper;
import com.hyj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> selectAll(){
        return userMapper.selectAll();
    }
    public List<User> findByName(User user){
        return userMapper.findByName(user);
    }
    public int deleteById(int  id){
        return  userMapper.deleteById(id);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }
    public User selectById(User user){
        return userMapper.selectById(user);
    }
    public int updatById(User user){
        return userMapper.updatById(user);
    }
}
