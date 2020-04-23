package com.martilda.app.testappplication.service;

import com.martilda.app.testappplication.entity.UserEntity;
import com.martilda.app.testappplication.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserEntityService {
    public UserInfo getUserMethod(Integer id);
    public List<UserEntity> getUsers();
    public UserInfo convertEntityToModel(UserEntity userEntity);
    public String createUser(String name, String address);
}
