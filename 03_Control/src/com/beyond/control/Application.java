package com.beyond.control;

import com.beyond.control.practice.A_If;
import com.beyond.control.practice.B_Switch;
import com.beyond.control.practice.C_For;

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
        // b.method02();
        // b.close();

        C_For c = new C_For();
        // c.method01();
        // c.method02();
        c.method03();
    }
}
