package com.beyond.assiststream.practice;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {
    @Serial
    private static final long serialVersionUID = -8725445736704888766L;

    private String id;
    private transient String password;
    private String name;
    private int age;
    private char gender;
    private transient double point;

    public Member(String id, String password, String name, int age, char gender, double point) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
