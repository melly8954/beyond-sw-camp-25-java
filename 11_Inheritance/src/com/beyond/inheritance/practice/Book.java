package com.beyond.inheritance.practice;

import java.util.Objects;

// 모든 클래스는 Object 클래스를 상속받고있다.
// 즉, 모든 클래스의 최상위 클래스는 Object 클래스이다.
public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String information() {
        return String.format("title: %s, author: %s, price: %d", title, author, price);
    }

    // 1. Object 클래스의 toString() 메서드
    // - toString() 메서드는 객체의 문자열 정보를 리턴한다.
    // - 기본적으로 Object 클래스에서는 "클래스명@해시코드" 형태로 리턴한다.
    // - 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 메서드 오버라이딩 가능
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    // 2. Object 클래스의 equals() 메서드
    // - 매개값으로 전달받은 객체와 자신이 동일한 객체인지 확인하는 메서드이다.
    // - 동일한 객체라면 true 리턴하고 그렇지 않으면 false를 리턴한다.
    // - 기본적으로 Object 클래스에서는 주소값을 비교하는데
    //   자식 클래스에서 객체들이 가지고 있는 필드의 값들을 비교하도록 재정의할 수 있다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    // 3. Object 클래스의 hashCode() 메서드
    // - 객체의 해시코드란 객체를 식별할 수 있는 하나의 정수값을 의미한다.
    // - 기본적으로 Object 클래스의 hashCode() 메서드는 객체의 메모리 주소를 이용해서 생성한다.
    // - 자식 클래스에서 객체들이 가지고 있는 필드의 값들이 같으면 동일한 해시코드를 리턴하도록 재정의 할 수 있다.
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
