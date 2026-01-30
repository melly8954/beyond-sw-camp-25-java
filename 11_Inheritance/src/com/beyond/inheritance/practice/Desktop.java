package com.beyond.inheritance.practice;

public class Desktop extends Product{
    private boolean allInOne;

    public Desktop() {
        // super() 생략 시 자동으로 생성한다.
        // super() 호출 시 먼저 호출되지 않고 뒤에서 호출 된다면 에러 발생
        System.out.println("자식 생성자의 기본 생성자 호출");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        // super() 생략 시 컴파일러가 자동으로 super()를 첫 줄에 넣음
        // super()가 호출될 경우 부모 생성자의 기본 생성자를 호출하게 된다.
        // 매개 변수를 넣지 않으면 부모 생성자의 기본 생성자를 호출하여 기본 값으로 출력됨
        // 자식 클래스는 부모 클래스의 기본 생성자를 먼저 호출하게 되므로 부모 클래스의 기본 생성자가 없으면 에러 발생

        // 부모 필드를 초기화 시킬 수 있는 방법
        // 1. 부모의 생성자를 호출해서 초기화
//        super(code, name, brand, price);

        // 2. 부모의 Setter 메서드 호출해서 초기화 (Setter를 사용한 간접 접근)
        // super()가 생략 되어 부모 생성자의 기본 생성자를 먼저 호출
//        this.setCode(code); // 가능함
//        setName(name);  // 가능함
//        super.setBrand(brand);  // 가능함
//        super.setPrice(price);
//        this.allInOne = allInOne;

        // 3. 부모의 필드에 직접 접근해서 초기화 (protected 접근 제한자 사용)
        this.code = code;
        this.name = name;
        super.brand = brand;
        super.price = price;

        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    @Override
    public String information() {
        return String.format("%s, allInOne: %b", super.information(), allInOne);
    }
}
