package com.geekster.UserManagement.Repository;

import com.geekster.UserManagement.User;


import java.util.List;



public interface UserRepository {
    void addUser(User user);
    User getUserById(int userId);
    List<User> getAllUsers();
    void updateUserInfo(int userId, User updatedUser);
    void deleteUser(int userId);
}
