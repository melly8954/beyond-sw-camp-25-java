package com.beyond.method.practice;

public class B_Overloading {
    public void test() {
        // 메서드 오버로딩의 대표적인 메서드
        System.out.println();
    }

    public void test(int i) {
        System.out.println();
    }

    public void test(String s) {
        System.out.println();
    }

    public void test(int i, String s) {
        System.out.println();
    }

    public void test(int i, int n) {
        System.out.println();
    }

    // 매개 변수의 이름이 다르다고 오버로딩이 적용되지 않는다.
    // public void test(int x, int y) {}

    // 접근제한자가 다르다고 오버로딩이 적용되지 않는다.
    // private void test(int x, int y) {}

    // 반환형이 다르다고 오버로딩이 적용되지 않는다.
    // private int test(int x, int y) {
    //     return 0;
    // }
}
