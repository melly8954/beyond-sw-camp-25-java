package com.beyond.api.practice;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
    java.util.Date 클래스
        - 날짜와 시간을 표현하는 클래스이다.
        - 주로 객체 간에 날짜와 시간 정보를 주고받을 때 사용한다.

    java.time 패키지
        - 자바 1.8부터 날짜와 시간을 나타내는 java.time 패키지를 사용한다.
        - 생성자를 직접 호출하지 않고 정적 메서드를 통해 객체를 얻는 방식이다.
        java.time.LocalDateTime
            - 날짜와 시간 정보 모두를 지정할 수 있는 객체를 생성하는 클래스이다.
        java.time.LocalDate
            - 날짜 정보를 지정할 수 있는 객체를 생성하는 클래스이다.
        java.time.LocalTime
            - 시간 정보를 지정할 수 있는 객체를 생성하는 클래스이다.
*/
public class C_DateTime {
    // java.util.Date 사용
    public void method01() {
        // 1. Date 객체 생성 (대부분 관련 메서드 @Deprecated)
        // 현재 시스템의 날짜와 시간에 대한 정보를 가지고 객체를 생성한다.
        Date today = new Date();
        // 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위(ms)의 시간을 표현하는 Date 객체를 생성한다.
        // KST는 한국 기준(+9)
        Date when = new Date(1);
        Date when_test = new Date(1000);    // 1초

        System.out.println(today);  // Tue Feb 03 12:20:07 KST 2026
        System.out.println(when);   // Thu Jan 01 09:00:00 KST 1970
        System.out.println(when_test);  // Thu Jan 01 09:00:01 KST 1970
        System.out.println();


        // 2. 날짜와 시간 정보 출력
        System.out.println(today.getTime());    // 1770088873161 (ms)
        System.out.println(today.getYear() + 1900); // 2026
        System.out.println(today.getMonth() + 1);   // 2
        System.out.println(today.getDate());
        System.out.println(today.getHours());
        System.out.println(today.getMinutes());
        System.out.println(today.getSeconds());
        System.out.println();


        // 3. SimpleDateFormat 클래스 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
        System.out.println(sdf.format(today));  // 2026-02-03(화) 12:30:54
    }

    // java.time 패키지 사용
    public void method02() {
        // 1. LocalDateTime 객체 생성
        // 현재 시스템의 날짜와 시간 정보를 가지고 객체를 생성한다.
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);    // 2026-02-03T12:45:14.023786
        System.out.println(ZonedDateTime.now());    // 2026-02-03T14:03:51.926364800+09:00[Asia/Seoul]
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));    // 2026-02-03T05:05:39.391232500Z[UTC]
        System.out.println(LocalDateTime.of(2026, 1 ,15, 15, 30, 45));
        System.out.println(LocalDateTime.parse("2025-12-31T23:59:59"));
        System.out.println();


        // 2. 날짜와 시간 정보 출력
        System.out.println(now.getYear());      // 2026
        System.out.println(now.getMonth());     // FEBRUARY
        System.out.println(now.getMonthValue());    // 2
        System.out.println(now.getDayOfMonth());    // 3
        System.out.println(now.getDayOfWeek()); // TUESDAY
        System.out.println(now.getDayOfYear()); // 34
        System.out.println();


        // 3. 날짜와 시간을 조작하는 메서드
        System.out.println(now);
        System.out.println(now.plusDays(1));
        System.out.println(now.plusYears(1).minusMonths(1).minusDays(2));
        System.out.println();


        // 4. 날짜와 시간을 비교하는 메서드
        System.out.println(now.isEqual(now.plusDays(1)));   // false
        System.out.println();

        System.out.println(now.isAfter(now.plusDays(1)));   // false
        System.out.println(now.isBefore(now.plusDays(1)));   // true
        System.out.println();


        System.out.println(now.isAfter(now.minusDays(1)));  // true
        System.out.println(now.isBefore(now.minusDays(1)));  // false
        System.out.println();


        // 5. LocalDate 객체 생성
        // LocalDateTime 객체 기능과 동일 (단, 시간 정보는 제외)
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2027,1,1));
        System.out.println(LocalDate.parse("2026-01-31"));
        System.out.println();


        // 6. LocalTime 객체 생성
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(15,30,45));
        System.out.println(LocalTime.parse("15:30:45"));
        System.out.println();


        // 7. DateTimeFormatter 클래스 사용
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy년 MM월 dd일 HH시 mm분 ss초"
        );

        System.out.println(LocalDateTime.now());
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
