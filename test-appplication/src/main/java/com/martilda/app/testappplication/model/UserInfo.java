package com.martilda.app.testappplication.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Data
public class UserInfo {
    private Integer userId;
    private String userName;
    private String address;
}

