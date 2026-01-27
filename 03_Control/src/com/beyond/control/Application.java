package com.beyond.control;

import com.beyond.control.practice.A_If;
import com.beyond.control.practice.B_Switch;
import com.beyond.control.practice.C_For;
import com.beyond.control.practice.D_While;
import com.beyond.control.practice.E_Branch;
import com.beyond.control.practice.F_LoopPractice;

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
        // c.method03();

        D_While d = new D_While();
        // d.method01();
        // d.method02();

        E_Branch e = new E_Branch();
        // e.method01();
        // e.method02();

        F_LoopPractice f = new F_LoopPractice();
        // f.practice1();
        // f.practice2();
        // f.practice3();
        // f.practice4();
        // f.practice5();
        // f.practice6();
        // f.close();
    }
}
