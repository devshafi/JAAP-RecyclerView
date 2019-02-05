package com.recyclerview.recyclerview.model;

public class User {

    private String name;
    private String mobileNo;
    private String age;

    // constructor
    public User(String name, String mobileNo,String age){

        this.name = name;
        this.mobileNo = mobileNo;
        this. age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
