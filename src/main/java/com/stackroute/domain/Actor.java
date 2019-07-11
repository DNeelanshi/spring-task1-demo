package com.stackroute.domain;

public class Actor {

   private String name;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String gender;
    private int age;


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
