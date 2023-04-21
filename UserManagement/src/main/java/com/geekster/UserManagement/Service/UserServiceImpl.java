package com.geekster.UserManagement.Service;

import com.geekster.UserManagement.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class UserServiceImpl implements UserService{

    private List<User> userList;
    public UserServiceImpl(){
        userList = new ArrayList<>();
    }
    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public User getUserById(int userId) {
        for(User user : userList){
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void updateUserInfo(int userId, User user) {
        for (User u : userList) {
            if (u.getUserId() == user.getUserId()) {
                u.setName(user.getName());
                u.setUserName(user.getUserName());
                u.setAddress(user.getAddress());
                u.setPhoneNumber(user.getPhoneNumber());
                break;
            }
        }
    }

    @Override
    public void deleteUser(int userId) {
        userList.removeIf(user-> user.getUserId()==userId);
    }
}
