package com.trainingdev.td_bs_management_user.controller;

import com.trainingdev.td_bs_management_user.dto.user.UserDetail;
import com.trainingdev.td_bs_management_user.dto.user.UserRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
public class userController {
    @PostMapping("/user")
    public UserDetail createUser(@RequestBody UserRequest userRequest) {
        return new UserDetail();
    }

    @PutMapping("/user")
    public UserDetail updateUser(@RequestBody UserDetail userDetail) {
        return new UserDetail();
    }

    @GetMapping("/user/{id}")
    public UserDetail getUser(@RequestParam int id) {
        return new UserDetail();
    }
}
