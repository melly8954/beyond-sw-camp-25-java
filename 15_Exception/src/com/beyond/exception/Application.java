package com.beyond.exception;

import com.beyond.exception.practice.A_TryCatchFinally;
import com.beyond.exception.practice.B_Throws;
import com.beyond.exception.practice.C_RunTimeException;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

//        new A_TryCatchFinally().method01();
//        System.out.println();

//        try{
//            new B_Throws().method01();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }

        new C_RunTimeException().method01();

        System.out.println();
        System.out.println("Application 종료..");
    }
}
