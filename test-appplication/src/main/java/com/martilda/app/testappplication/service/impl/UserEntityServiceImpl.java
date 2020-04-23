package com.martilda.app.testappplication.service.impl;

import com.martilda.app.testappplication.entity.UserEntity;
import com.martilda.app.testappplication.model.UserInfo;
import com.martilda.app.testappplication.repository.UserRepository;
import com.martilda.app.testappplication.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityServiceImpl implements UserEntityService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo getUserMethod(Integer id) {
        UserEntity  object = userRepository.getOne(id);
        return convertEntityToModel(object);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserInfo convertEntityToModel(UserEntity userEntity) {
         UserInfo userInfo = new UserInfo();
         userInfo.setUserId(userEntity.getUserId());
         userInfo.setUserName(userEntity.getName());
         userInfo.setAddress(userEntity.getAddress());
        return userInfo;
    }

    @Override
    public String createUser(String name, String address) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAddress(address);
        userRepository.save(userEntity);
        return "User is created.";
    }
}
