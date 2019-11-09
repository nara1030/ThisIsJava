Enum
=====
## 목차
1. [개요](#개요)
	* [개념](#개념)
	* [배경](#배경)
2. [상세](#상세)
	* [선언](#선언)
		* [Inheritance](#Inheritance)
		* [Compare](#Compare)
	* [사용](#사용)
		* [Constructor](#Constructor)
		* [Methods](#Methods)
	* [활용](#활용)
		* [Enum collections - EnumMap and EnumSet](#Enum-collections---EnumMap-and-EnumSet)
	* [예시](#예시)
		* [if문 대체](#if문-대체)
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
이러한 type(**enum**)이 도입된 배경을 살펴보면 그 의도를 더 명확히 알 수 있다. 자바 1.5 버전 이전에 **상수**를 정의했던 다양한 방법을 살펴본다.

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
		int MONDAY = 1;	// public static final 생략(∵ interface)
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
		* 각각의 상수들이 서로 같은 데이터 `type`을 갖지만, 서로 다른 데이터 값을 가짐(∴ 서로 다른 데이터 `type` 비교시 컴파일 에러 o)
		* 단, `switch`문에서 사용 x(∵ `switch`문의 조건에 들어가는 데이터 `type`이 제한적)

위의 문제점들을 해결한 방법 중 하나가 바로 **enum** `type`이다. 즉, **enum**을 사용하는 이유는 다음과 같다.

* 코드 가독성 향상
* 인스턴스 생성과 상속 방지
* 구현 의도 열거임을 명시
		
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

#### Inheritance
As mentioned eariler, **enum extends Enum class**. `java.lang.Enum` is an abstract class. This is the common base class of all Java enumeration types.

```java
// java.lang.Enum.java
public abstract class Enum<E extends Enum<E>>
			extends Object
			implements Comparable<E>, Serializable {
}
```

It means that all enums are **comparable** and **serializable** implicitly. Also, all enum types in Java are **singleton** by default(`컴파일 확인해야 알 수 있는, 외워야 하는건가?`).

As noted all enums extends `java.lang.Enum`, so **enum cannot extend any other class** because Java does not support multiple inheritance this way. But enums can implement any number of interfaces.

##### [목차로 이동](#목차)

#### Compare
All enums are by default **comparable and singletons** as well. It means you can compare them with `equals()` method, even with `"=="` operator.

```java
// EnumExample.java
Direction east = Direction.EAST;
Direction eastNew = Direction.valueOf("EAST");

System.out.println(east == eastNew);		// true
System.out.println(east.equals(eastNew));	// true
```

참고로, 같은 타입에 대한 비교만 가능하다(∵ 컴파일 에러 검출).

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

#### Constructor
By default, **enums don't require constructor** definitions and their default values are always the string used in the declaration. Though, you can give define your own constructors to initialize the `state` of enum types.

For example, we can add `angle` attribute to direction. All directions have some angle. So let's add them.

```java
// enum with constructor
public enum Direction {
	EAST(0), WEST(180), NORTH(90), SOUTH(270);
	
	private Direction(final int angle) {	// 매개변수에 final을..?
		this.angle = angle;
	}
	
	private int angle;
	
	public int getAngle() {
		return angle;
	}
}
```

If you want to access angle for any direction, we can make a simple method call in enum field reference.

```java
// EnumExample.java
Direction north = Direction.NORTH;
System.out.println(north);		// NORTH
System.out.println(north.getAngle());	// 90
System.out.println(Direction.NORTH.getAngle());	// 90
```

- - -
enum의 각 열거형 상수에 추가 속성(위에선 `state`라고 썼는데, 구체적으로는 `angle`)을 부여할 수 있다. 즉, 속성(메소드나 필드)을 enum 타입에 추가하면 enum 상수에 데이터를 연관시킬 수 있다. 예로 생성자의 파라미터를 통해 추가 속성을 enum 클래스의 필드에 설정해주고, getter 메소드(`getAngle()`)를 통해 해당 속성을 가져다 쓸 수 있다.

참고로 enum 타입의 생성자는 접근 제어자를 **private**으로 지정해야 한다. 위에도 언급했듯, enum이 나온 배경은 컴파일 시 타입 안정성을 보장하기 위함이었다. 즉, enum 타입은 `run-time`이 아닌 `compile-time`에 모든 값(`고정된 상수들의 집합`)을 알고 있어야 한다. 그렇게 함으로써 다른 패키지나 클래스에서 enum 타입에 접근해서 동적으로 값을 지정하는 것을 막는다(뿐만 아니라 해당 enum 클래스 내에서도 `new` 키워드로 인스턴스 생성이 불가하며 `newInstance()`, `clone()` 등의 메소드도 사용 불가(`??`)).

##### [목차로 이동](#목차)

#### Methods
Remember that enum is basically a special class type, and can have methods and fields just like any other class. You can add methods which are **abstract** as well as **concrete methods** as well. Both methods are allowed in enum.

##### concrete methods in enum
Adding a concrete method in enum is similar to add same method in any other class. You can use any access specifier e.g. `public`, `private`, or `protected`. You can return values from enum methods or simply use them to perform internal logic.

```java
// enum : non-abstract method
public enum Direction {
	EAST, WEST, NORTH, SOUTH;
	
	protected String printDirection() {
		String message = "You are moving in " + this + " direction";
		System.out.println(message);
		return message;
	}
}
```

You can call `printDirection()` method as simple method calls on **enum instance**.

```java
// EnumExample.java
Direction.NORTH.printDirection();	// You are moving in NORTH direction

Direction.EAST.printDirection();	// You are moving in EAST direction
```

##### abstract methods in enum
We can add **abstract method in enums**. In this case, we must implement the abstract method **at each enum field**, individually.

```java
public enum Direction {
	EAST {
		@Override
		public String printDirection() {
			String message = "You are moving in east. You will face sun in morning time."
			return message;
		}
	},
	WEST {
		@Override
		public String printDirection() {
			String message = "You are moving in west. You will face sun in evening time."
			return message;
		}	
	},
	NORTH {
		@Override
		public String printDirection() {
			String message = "You are moving in north. You will face head in daytime."
			return message;
		}
	},
	SOUTH {
		@Override
		public String printDirection() {
			String message = "You are moving in south. Sea ahead."
			return message;
		}
	};
	
	public abstract String printDirection();
}
```

Re-run above example.

```java
// EnumExample.java
Direction.NORTH.printDirection();	// You are moving in north. You will face head in daytime.

Direction.EAST.printDirection();	// You are moving in east. You will face sun in morning time.
```

You can **enforce a contract for all enums** to be created in this way. It can serve as **template for enum creation**.

##### [목차로 이동](#목차)

### 활용
#### Enum collections - EnumMap and EnumSet


##### [목차로 이동](#목차)

### 예시

#### if문 대체
**enum**을 사용해서 `if`문 사용을 대체할 수 있다(∵ 가독성 ↑).

```java
public enum PowerSwitch {
	ON("켜짐"),
	OFF("꺼짐");
	
	private String krName;
	
	private PowerSwitch(String krName) {
		this.krName = krName;
	}
	
	public String getKrName() {
		return krName;
	}
	
	public PowerSwitch opposite() {
		if(this == PowerSwitch.ON) {
			return PowerSwitch.OFF;
		} else {
			return PowerSwitch.ON;
		}
	}
}
```

enum을 통해 `ON`, `OFF` 이름으로 각각 상수를 정의한다. 그리고 `opposite()` 메소드를 통해 `ON` 상수에서 호출하면 `OFF`를 반환하고, `OFF` 상수에서 호출하면 `ON`을 반환하게 되는 메소드다.

```java
public class PowerSwitchMain {
	public static void main(String[] args) {
		PowerSwitch powerSwitch = PowerSwitch.ON;
		displayByPowerSwitch(powerSwitch.opposite());	// 전원이 꺼짐
	}
	
	public static void displayByPowerSwitch(PowerSwitch powerSwitch) {
		if(powerSwitch == PowerSwitch.ON) {
			System.out.println("전원이 " + PowerSwitch.ON.getKrName());
		} else {
			System.out.println("전원이 " + PowerSwitch.OFF.getKrName());
		}
	}
}
```

##### [목차로 이동](#목차)

## 참고
* [Java Enum - HowToDoInJava](https://howtodoinjava.com/java/enum/enum-tutorial/)
* [Java: enum의 뿌리를 찾아서... - NEXTREE](http://www.nextree.co.kr/p11686/)
* [Effective Java Ch6 Enums and Annotations - Sophie](http://128.199.231.48/effective-java-ch-6-enums-and-annotations/)

##### [목차로 이동](#목차)
