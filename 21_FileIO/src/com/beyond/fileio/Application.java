package com.beyond.fileio;

import com.beyond.fileio.practice.A_File;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        A_File a = new A_File();
        a.method01();

        System.out.println("Application 실행 종료..");
    }
}
