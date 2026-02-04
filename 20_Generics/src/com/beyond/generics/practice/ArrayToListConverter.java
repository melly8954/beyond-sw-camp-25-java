package com.beyond.generics.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    타입 파라미터는 대문자 알파벳 한 글자로 표현한다.
    E - Element
    K - Key
    V - Value
    T - Type
    N - Number
    R - Result
 */

// <T> 는 객체 호출 시점에서 결정된다.
public class ArrayToListConverter<T extends Number> {
    private final T[] values;

    public ArrayToListConverter(T[] values) {
        this.values = values;
    }

    public void print() {
        for(T v : values) {
            System.out.println(v);
        }
    }

    public List<T> toList() {
        List<T> list = new ArrayList<>();
//        for(T value : values) {
//            list.add(value);
//        }
        Collections.addAll(list,values);

        return list;
    }

}
