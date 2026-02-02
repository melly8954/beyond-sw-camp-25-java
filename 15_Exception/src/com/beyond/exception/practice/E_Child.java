package com.beyond.exception.practice;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

public class E_Child extends D_Parent{
//    @Override
//    public void method01() {
//        // 오버라이딩 시 예외를 throws 하지 않아도 된다.
//    }

//    @Override
//    public void method01() throws FileNotFoundException {
//        // 부모 클래스의 메서드보다 하위 타입의 예외를 throws 하는 것은 가능하다.
//    }

    @Override
    public void method01() throws FileNotFoundException, EOFException, SocketException {
        // 부모 클래스의 메서드보다 하위 타입들의 예외를 throws 하는 것은 가능하다.
    }

//    @Override
//    public void method01() throws Exception {
//        // 부모 클래스의 메서드보다 상위 타입의 예외를 throws 하는 것은 불가능하다.
//    }

}
