package com.geekster.UserManagement.Service;

import com.geekster.UserManagement.User;


import java.util.List;



public interface UserService {
    void addUser(User user);

    User getUserById(int UserId);
    List<User> getAllUsers();

    void updateUserInfo(int userId, User user);

    void deleteUser(int userId);

}
