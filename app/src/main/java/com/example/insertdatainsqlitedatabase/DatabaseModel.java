package com.example.insertdatainsqlitedatabase;

public class DatabaseModel {
    //user er theke j data newar por ei class nibo and ei class er object k direct database a send korbo

    String name;
    int age;
    String address;

    public DatabaseModel(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
