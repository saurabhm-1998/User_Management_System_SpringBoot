package com.geekster.UserManagement.Controller;


import com.geekster.UserManagement.Service.UserService;
import com.geekster.UserManagement.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added successfully";
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateUserInfo")
    public String updateUserInfo(@PathVariable int userId, @RequestBody User user) {
        userService.updateUserInfo(userId, user);
        return "User info updated successfully";
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
        return "User deleted successfully";
    }
}
