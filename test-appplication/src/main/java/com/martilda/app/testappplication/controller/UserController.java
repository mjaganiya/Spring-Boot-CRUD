package com.martilda.app.testappplication.controller;

import com.martilda.app.testappplication.entity.UserEntity;
import com.martilda.app.testappplication.model.UserInfo;
import com.martilda.app.testappplication.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//localhost:8080/GetApi/User?id=1

@Controller
@RequestMapping("/GetApi")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("/User")
    private @ResponseBody ResponseEntity<UserInfo> getUser(@RequestParam Integer id) {
       UserInfo userInfo = userEntityService.getUserMethod(id);
        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }

    @PostMapping("/User")
    private @ResponseBody String createUser1(@RequestParam String name, String address){
         return userEntityService.createUser(name,address);
    }
//
//    @PostMapping
//    private @ResponseBody String createUser2(@RequestBody UserInfo userInfo){
//        return userEntityService.createUser(userInfo.getUserName(),userInfo.getAddress());
//    }

    @GetMapping("/User/list")
    private @ResponseBody ResponseEntity<List<UserEntity>> getUsers() {
        List<UserEntity> userEntityList = userEntityService.getUsers();
        return new ResponseEntity<>(userEntityList, HttpStatus.OK);
    }

    @GetMapping("/User/{id}")
    private @ResponseBody ResponseEntity<UserInfo> getUser2(@PathVariable Integer id) {
        UserInfo userInfo = userEntityService.getUserMethod(id);
        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }

}
