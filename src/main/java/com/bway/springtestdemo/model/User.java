package com.bway.springtestdemo.model;

public class User {
    private int id;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String role;

    private String enteredname;
    private String enteredpass;

    public String getEnteredname() {
        return enteredname;
    }

    public void setEnteredname(String enteredname) {
        this.enteredname = enteredname;
    }

    public String getEnteredpass() {
        return enteredpass;
    }

    public void setEnteredpass(String enteredpass) {
        this.enteredpass = enteredpass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
