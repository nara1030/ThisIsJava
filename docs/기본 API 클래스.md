기본 API 클래스
============

## 목차
1. [자바 API 도큐먼트](#자바-api-도큐먼트)
2. [java.lang과 java.util 패키지](#java.lang과-java.util-패키지)
3. [Object 클래스](#object-클래스)
4. [Objects 클래스](#objects-클래스)
5. [System 클래스](#system-클래스)
6. [Class 클래스](#class-클래스)
7. [String 클래스](#string-클래스)
8. [StringTokenizer 클래스](#stringtokenizer-클래스)
9. [StringBuffer, StringBuilder 클래스](#stringbuffer,-stringbuilder-클래스)
10. [정규 표현식과 Pattern 클래스](#정규-표현식과-pattern-클래스)
11. [Arrays 클래스](#arrays-클래스)
12. [Wrapper(포장) 클래스](#wrapper(포장)-클래스)
13. [Math, Random 클래스](#math,-random-클래스)
14. [Date, Calendar 클래스](#date,-calendar-클래스)
15. [Foramt 클래스](#format-클래스)
16. [java.time 패키지](#java.time-패키지)

## 자바 API 도큐먼트

## java.lang과 java.util 패키지

## Object 클래스

## Objects 클래스

## System 클래스

## Class 클래스

## String 클래스

## StringTokenizer 클래스

## StringBuffer, StringBuilder 클래스

## 정규 표현식과 Pattern 클래스

## Arrays 클래스

## Wrapper(포장) 클래스

#### 정의
+ 기본 타입의 값(field)을 갖는 객체를 지칭
+ 왜 '포장'인가?
	+ 그 이유는 기본 타입의 값을 내부에 두고 포장하기 때문
	+ 즉 포장하고 있는 기본 타입의 값은 외부에서 변경 불가

#### 박싱 & 언박싱
+ 박싱(Boxing): 기본 타입의 값 → 포장 객체
	+ 포장 클래스의 생성자 매개값으로 기본 타입의 값 또는 문자열 넘김
	+ 각 포장 클래스마다 가지고 있는 정적 valueOf() 메소드 이용
+ 언박싱(Unboxing): 포장 객체 → 기본 타입의 값
	+ 각 포장 클래스마다 가지고 있는 "기본타입명+Value()" 메소드 호출

> 주의
>> 자동 박싱과 언박싱은 자바 5부터 추가된 기능  
>> 따라서 자바 4 이전 버전에서는 직접 박싱과 언박싱을 해주어야 함  

#### 필요성(용도)
1. 원시적 데이터 형식을 객체로 변환
	+ 기본 타입의 값을 박싱해서 포장 객체 생성
	+ 클래스가 제공하는 메소드 및 상수(ex. MIN_VALUE) 사용
	+ *Objects are needed when we need to pass an argument in the given method*
2. 문자열을 기본 타입 값으로 변환
	+ 대부분의 포장 클래스에 있는 "parse+기본타입명"인 정적 메소드 사용
3. java.util 패키지의 클래스 사용 목적
	+ 객체만 처리
4. ArrayList 및 Vector와 같은 컬렉션 프레임워크 데이터 구조 사용 목적
	+ 기본 유형이 아닌 객체만 저장
5. 멀티 스레딩에서 동기화 지원하려면 객체 필요

#### 비교


> 원시 타입과 문자열을 포장하라  

```java
public class Money {
	private static final int MONEY_PER_LOTTO = 1_000;
	
	private final int money;
	
	public Money(int money) {
		if(money < MONEY_PER_LOTTO) {
			throw new IllegalArgumentException("로또 구입금액은 1000원 이상이어야 합니다.");
		}
		this.money = money;
	}
	[...]
}
```

> 위의 경우, 구입 금액을 Money 객체로 포장  
>> 이처럼 OOP에선 원시 타입과 문자열을 포장

+ 참고문서
	+ [목적의식 있는 연습을 통한 효과적인 학습](http://woowabros.github.io/woowabros/2019/05/02/techcourse.html?fbclid=IwAR3XaCT6eav1_xZE9ZnjCR2u3s4Ci96eosWGE6qsiWIM6wpplms4ca6qbfs)
	+ [Wrapper Class in Java](https://data-flair.training/blogs/wrapper-class-in-java/)

## Math, Random 클래스

## Date, Calendar 클래스

## Foramt 클래스

## java.time 패키지

