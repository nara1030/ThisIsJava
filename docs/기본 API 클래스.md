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
> 적절한 Collection(자료구조)를 활용하라  
>> 일차로 List, Set, Map을 적절하게 활용  
>> 적절한 자료구조가 없다면 나만의 자료구조 구현  

```java
// 각 등수별 당첨된 로또 수 - Map을 통해 구현
public class LottoResult {
	private Map<Rank, Integer> result = new HashMap<>();
	
	public LottoResult() {
		for(Rank rank : Rank.values()) {
			result.put(rank, 0);
		}
	}
	
	public void putRank(Rank rank) {
		result.put(rank, result.get(rank) + 1);
	}
}
```

#### 정의
+ API(Application Programming Interface)
	+ 프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음
	+ String 클래스, System 클래스도 모두 API
	+ 라이브러리(library)라고도 부름
	+ 설치경로
		+ <JDK 설치 경로>\jre\lib\rt.jar
	+ API 도큐먼트
		+ http://docs.oracle.com/javase/8/docs/api/

+ 참고문서
	+ [목적의식 있는 연습을 통한 효과적인 학습](http://woowabros.github.io/woowabros/2019/05/02/techcourse.html?fbclid=IwAR3XaCT6eav1_xZE9ZnjCR2u3s4Ci96eosWGE6qsiWIM6wpplms4ca6qbfs)

## java.lang과 java.util 패키지

## Object 클래스

*[Map과 식별키 정리; hashCode()](https://jojoldu.tistory.com/134)*  
*[clone()과 protected](https://stackoverflow.com/questions/1138769/why-is-the-clone-method-protected-in-java-lang-object)*

## Objects 클래스

## System 클래스

## Class 클래스

## String 클래스

## StringTokenizer 클래스

## StringBuffer, StringBuilder 클래스

## 정규 표현식과 Pattern 클래스

## Arrays 클래스

## Wrapper(포장) 클래스
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
		+ Call by reference(?)
	+ 입력값 검사에 사용
2. 문자열을 기본 타입 값으로 변환
	+ 대부분의 포장 클래스에 있는 "parse+기본타입명"인 정적 메소드 사용
3. java.util 패키지의 클래스 사용 목적
	+ 객체만 처리
4. ArrayList 및 Vector와 같은 컬렉션 프레임워크 데이터 구조 사용 목적
	+ 기본 유형이 아닌 객체만 저장
5. 멀티 스레딩에서 동기화 지원하려면 객체 필요

#### 비교
> 포장 객체에 정확히 어떤 값이 저장될지 모르는 상황이라면   
>> 첫째, 직접 내부 값을 언박싱해서 비교  
>> 둘째, equals() 메소드로 내부 값을 비교

+ 포장 객체는 내부의 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없음
	+ 이 연산자는 내부의 값을 비교하는 것이 아니라 포장 객체의 참조를 비교하기 때문
	+ 따라서 내부의 값을 비교하려면 언박싱한 값을 얻어 비교
+ 예외로 포장 객체더라도 다음 범위 안의 값이라면 ==와 != 연산자로 내부의 값을 바로 비교 가능  

| 타입 | 값의 범위 |
| --- | ------- |
| boolean | true, false |
| char | \u0000 ~ \u007f |
| byte, short, int | -128 ~ 127 |

```java
Integer obj1 = 300;
Integer obj2 = 300;
System.out.println(obj1 == obj2); // false 출력
```

#### 예제 코드  

```java
// 추후 추가
```

+ **읽어보고 삭제**
	+ [Servlet Wrapper Classes](https://self-learning-java-tutorial.blogspot.com/2014/08/servlet-wrapper-classes.html)
	+ [Request Wrappers and Response Wrappers](https://javajee.com/request-wrappers-and-response-wrappers)
	+ [Wrapper Class에 대하여](http://iyanjava.blogspot.com/2011/02/wrapper-class.html)

+ 참고문서
	+ [목적의식 있는 연습을 통한 효과적인 학습](http://woowabros.github.io/woowabros/2019/05/02/techcourse.html?fbclid=IwAR3XaCT6eav1_xZE9ZnjCR2u3s4Ci96eosWGE6qsiWIM6wpplms4ca6qbfs)
	+ [Wrapper Class in Java](https://data-flair.training/blogs/wrapper-class-in-java/)

## Math, Random 클래스

## Date, Calendar 클래스

## Foramt 클래스

## java.time 패키지

