package com.beyond.practiceoop;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 실습 문제1
//        Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
//        Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
//        Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
//        System.out.println(p1.information());
//        System.out.println(p2.information());
//        System.out.println(p3.information());
//        System.out.println("=====================================================");
//
//        p1.setPrice(1200000);
//        p1.setTax(0.05);
//        p2.setPrice(1200000);
//        p2.setTax(0.05);
//        p3.setPrice(1200000);
//        p3.setTax(0.05);
//
//        System.out.println(p1.information());
//        System.out.println(p2.information());
//        System.out.println(p3.information());
//        System.out.println("=====================================================");
//
//
//        System.out.println("상품명 = " + p1.getName());
//        System.out.println("부가세 포함 가격 = " + p1.applyTax(p1.getPrice(), p1.getTax()) + "원");
//
//        System.out.println("상품명 = " + p2.getName());
//        System.out.println("부가세 포함 가격 = " + p2.applyTax(p1.getPrice(), p2.getTax()) + "원");
//
//        System.out.println("상품명 = " + p3.getName());
//        System.out.println("부가세 포함 가격 = " + p3.applyTax(p1.getPrice(), p3.getTax()) + "원");

        // 실습 문제2
//        Book b1 = new Book();
//        Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
//
//        System.out.println(b1.information());
//        System.out.println(b2.information());
//        System.out.println("=====================================================");
//
//        b1.setTitle("C언어");
//        b1.setPrice(30000);
//        b1.setDiscountRate(0.1);
//        b1.setAuthor("홍길동");
//
//        System.out.println("수정된 결과 확인");
//        System.out.println(b1.information());
//        System.out.println("=====================================================");
//
//        System.out.println("도서명 = " + b1.getTitle());
//        System.out.println("할인된 가격 = " + b1.applyDiscount(b1.getPrice(), b1.getDiscountRate()) +"원");
//
//        System.out.println("도서명 = " + b2.getTitle());
//        System.out.println("할인된 가격 = " + b2.applyDiscount(b2.getPrice(), b2.getDiscountRate()) +"원");

        // 실습 문제3
//        Student[] students = new Student[3];
//        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
//        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
//        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
//
//        for(Student s : students) {
//            System.out.println(s.information());
//        }
//        System.out.println();
//        System.out.println("=====================================================");
//        System.out.println();
//
//        Employee[] employees = new Employee[10];
//
//        Scanner sc = new Scanner(System.in);
//        int cnt = 0;
//
//        while(cnt < employees.length) {
//            System.out.println("이름, 나이, 키, 몸무게, 급여, 부서를 순서대로 입력해주세요.");
//            String name = sc.next();
//            int age = sc.nextInt();
//            double height = sc.nextDouble();
//            double weight = sc.nextDouble();
//            int salary = sc.nextInt();
//            String dept = sc.next();
//
//            employees[cnt] = new Employee(name, age, height, weight, salary, dept);
//
//            System.out.println("계속 추가 하시겠습니까? (Y/N)");
//            char answer = sc.next().charAt(0);
//            if(answer == 'n' || answer == 'N') {
//                break;
//            }
//
//            cnt++;
//        }
//
//        for(Employee e : employees) {
//            if(e != null) {
//                System.out.println(e.information());
//            }
//        }
    }
}
