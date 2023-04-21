package com.geekster.UserManagement;

public class User {
        private int UserId;
        private String name;
        private String userName;
        private String address;
        private String phoneNumber;

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(int userId, String name, String userName, String address, String phoneNumber) {
        UserId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }
}
