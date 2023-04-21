package com.geekster.UserManagement.Repository;

import com.geekster.UserManagement.User;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository


public class UserRepositoryImpl implements UserRepository{

    private List<User> users;

    public UserRepositoryImpl() {
        this.users= new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void updateUserInfo(int userId, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUserId() == userId) {
                users.set(i, updatedUser);
                break;
            }
        }

    }

    @Override
    public void deleteUser(int userId) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUserId() == userId) {
                users.remove(i);
                break;
            }
        }
    }

    }
