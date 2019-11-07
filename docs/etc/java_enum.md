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
	
##### [목차로 이동](#목차)

### 배경
* The very purpose of enum is to **enforce compile time type safety**.
* We should use enum when we know all possible values of a variable at compile time or design time, though we can add more values in future as and when we identify them`(?)`.

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

##### [목차로 이동](#목차)
