package com.beyond.set;

import com.beyond.set.practice.A_HashSet;
import com.beyond.set.practice.B_TreeSet;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        A_HashSet a = new A_HashSet();
//        a.method01();
//        a.method02();

        B_TreeSet b = new B_TreeSet();
        b.method01();
        b.method02();
    }
}
