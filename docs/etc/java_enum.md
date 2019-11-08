Enum
=====
## 목차
1. [개요](#개요)
	* [개념](#개념)
	* [배경](#배경)
2. [상세](#상세)
	* [선언](#선언)
	* [사용](#사용)
3. [참고](#참고)

## 개요

### 개념
> **Java enum**, also called Java **enumeration type**, is a type whose fields consist of a **fixed** set of constants.

* `Enumerations` are generally a set of **related** constants.
* Enumeration in Java is supported by keyword `enum`.
	* enums are a special type of class that always extends [java.lang.Enum](https://docs.oracle.com/javase/10/docs/api/java/lang/Enum.html).
* After JDK 1.4, Java designers decided to support it in Java also, and it was **officially released in JDK 1.5 release**.

----
위 내용을 바탕으로 이해한 바를 적어보면 **Java enum**이란 `class`나 `interface`처럼 일종의 **type**이다. 그렇다면 무엇을 선언하기 위한 **type**이냐? 바로 상수(**constant**), 특히 고정(**fixed**)되어 있고 서로 연관(**related**)된 상수들을 선언하기 위함임을 알 수 있다.

##### [목차로 이동](#목차)

### 배경
* The very purpose of enum is to **enforce compile time type safety**.
* We should use enum when we know all possible values of a variable at compile time or design time, though we can add more values in future as and when we identify them`(?)`.

----
이러한 type(enum)이 도입된 배경을 살펴보면 그 의도를 더 명확히 알 수 있다. 자바 1.5 버전 이전에 상수를 정의했던 다양한 방법을 살펴본다.

* `class` 내부에 `final static` 선언  
	```java
	public class Week {
		private final static int MONDAY = 1;
		private final static int TUESDAY = 2;
		// ...
	}
	```
	* 단점
		* 가독성 ↓(∵ 상수 집합 ↑)
		* 중복 변수명 → 컴파일 에러
* `interface`로 집합 분리  
	```java
	interface Week {
		int MONDAY = 1;		// public static final 생략(∵ interface)
		int TUESDAY = 2;
		// ...
	}
	
	interface Month {
		int JANUARY = 1;
		int FEBRUARY = 2;
		// ...
	}
	```
	* 단점
		* 컴파일 단계에서 에러 검출 x(∵ 서로 다른 `type` 비교 x)  
		```java
		if(Week.MONDAY == Month.JANUARY) {	// 런타임 에러
			System.out.println("두 상수는 같습니다.");
		}
		```
* 같은 집합의 상수들을 하나의 `type`으로 정의  
	```java
	class Week {
		public final static Week MONDAY = new Week();
		public final static Week TUESDAY = new Week();
		// ...
	}
	
	class Month {
		public final static Month JANUARY = new Month();
		public final static Month FEBRUARY = new Month();
		// ...
	}
	```
	* 단점
		* 각각의 상수들이 서로 같은 데이터 타입을 갖지만, 서로 다른 데이터 값을 가짐(∴ 서로 다른 데이터 타입 비교시 컴파일 에러 o)
		* 단, `switch`문에서 사용 x(∵ `switch`문의 조건에 들어가는 데이터 타입이 제한적)

##### [목차로 이동](#목차)

## 상세

### 선언
A simple example to **create enum**.

```java
// Direction.java
public enum Direction {
	EAST, WEST, NORTH, SOUTH
}
```

Logically, **each enum is an instance of enum type** itself. So given enum can be seen as below declaration.

```java
// Direction.java
final class Direction extends Enum<Direction> {
	public final static Direction EAST = new Direction();
	public final static Direction WEST = new Direction();
	public final static Direction NORTH = new Direction();
	public final static Direction SOUTH = new Direction();
}
```

**JVM internally adds ordinal and value methods** to this class which we can call while working with enum`(?)`.

- - -
선언 위치에 따라 컴파일에 차이가 있을 수 있다.

* [Enum 클래스의 사용과 이해 - 생활코딩](https://www.opentutorials.org/module/1226/8025)
* [Enum의 사용법 - Limky](https://limkydev.tistory.com/66)

##### [목차로 이동](#목차)

### 사용
We can use the enum just like we use `final static` fields.

```java
// EnumExample.java
public class EnumExample {
	public static void main(String[] args) {
		Direction north = Direction.NORTH;
		System.out.println(north);	// Prints NORTH
	}
}
```

##### [목차로 이동](#목차)

## 참고
* [Java Enum - HowToDoInJava](https://howtodoinjava.com/java/enum/enum-tutorial/)
* [Java: enum의 뿌리를 찾아서... - NEXTREE](http://www.nextree.co.kr/p11686/)

##### [목차로 이동](#목차)
