package com.javasead.day01oop;

public class Object01AnonymousUser {
    private String name;
    private String phoneNum;
    private String password;
    private String confirm;
    private String email;
    private String sex;
    private String birthdate;

    public Object01AnonymousUser() {
    }

    public Object01AnonymousUser(String name, String phoneNum, String password, String confirm, String email, String sex, String birthdate) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
        this.confirm = confirm;
        this.email = email;
        this.sex = sex;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
