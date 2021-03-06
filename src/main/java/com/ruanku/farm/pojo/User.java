package com.ruanku.farm.pojo;

public class User {
    private int user_id;
    private String user_account;
    private String user_name;
    private String user_password;
    private String user_email;
    private String user_phone;
    private String user_address;
    public User() {

    }

    public User(String user_account, String user_password) {
        this.user_account = user_account;
        this.user_password = user_password;
    }

    public User(String user_account, String user_name, String user_password, String user_email, String user_phone, String user_address) {
        this.user_account = user_account;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_address = user_address;
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
}
