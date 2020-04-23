package com.martilda.app.testappplication.repository;

import com.martilda.app.testappplication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findAll();
    UserEntity getOne(Integer id);
}
