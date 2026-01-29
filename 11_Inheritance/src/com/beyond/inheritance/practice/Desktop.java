package com.beyond.inheritance.practice;

public class Desktop extends Product{
    private boolean allInOne;

    public Desktop() {
        // super() 생략 시 자동으로 생성한다.
        // super() 호출 시 먼저 호출되지 않고 뒤에서 호출 된다면 에러 발생
        System.out.println("자식 생성자의 기본 생성자 호출");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        // super()가 생략되어 자동 생성으로 super()가 호출될 경우 부모 생성자의 기본 생성자를 호출하게 된다.
        // 매개 변수를 넣지 않았기 때문에 기본 값으로 출력됨
        super(code, name, brand, price);
        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }
}
