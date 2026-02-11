package com.beyond.streamapi.practice;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char gender;
    private int math;
    private int eng;

    public Student(String name, int age, char gender, int math, int eng) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", math=" + math +
                ", eng=" + eng +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && gender == student.gender && math == student.math && eng == student.eng && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, math, eng);
    }
}
