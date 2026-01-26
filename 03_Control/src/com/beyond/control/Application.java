package com.beyond.control;

import com.beyond.control.practice.A_If;
import com.beyond.control.practice.B_Switch;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        A_If a = new A_If();
        // a.method01();
        // a.method02();
        // a.method03();
        // a.practice();
        // a.close();

        B_Switch b = new B_Switch();
        // b.method01();
        b.method02();
        b.close();
    }
}
