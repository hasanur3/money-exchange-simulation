package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class User {
    private int id;
    private String password;
    private boolean isLogin;

    public User() {

    }

    public User(int id, String password, boolean isLogin) {
        this.id = id;
        this.password = password;
        this.isLogin = isLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", isLogin=" + isLogin +
                '}';
    }
}
