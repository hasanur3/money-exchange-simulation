package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class User {
    private int id;
    private String password,email;
    private boolean isLogin;

    public User() {

    }

    public User(int id, String password,String email, boolean isLogin) {
        this.id = id;
        this.password = password;
        this.email=email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", isLogin=" + isLogin +
                '}';
    }
}
