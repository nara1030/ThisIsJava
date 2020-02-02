오버로딩과 오버라이딩
=====
## 목차
1. [개요](#개요)
2. [오버로딩](#오버로딩)
	* [메서드 시그니처](#메서드-시그니처)
3. [오버라이딩](#오버라이딩)
4. [참고](#참고)

## 개요
흔히 자바 다형성의 예로 오버로딩과 오버라이딩을 드는데, 각 개념들을 이해한대로 적어본다. 먼저 OOP 시스템이 지원하는 다형성이란 구체적으로 다음 조건을 만족함을 의미한다([코드스피츠 참고](https://github.com/nara1030/TIL/blob/master/docs/lecture_list/code_spitz/s83_object1/object1_week1_ch00-ch01.md#Polymorphism)).

* Substitution: 대체가능성
* Inteneral identity: 내적동질성

이에 따라 나는 오버로딩은 다형성이라고 생각하지는 않는다. 각각에 대한 설명에 앞서 두 기술을 비교해보면 다음과 같다.

| 구분 | 오버로딩 | 오버라이딩 |
| -- | -- | -- |
| 메소드명 | 동일 | 동일 |
| 인자 타입 | 다름 | 동일 |
| 리턴 타입 | 무관 | (원칙적으론) 동일 |
	
##### [목차로 이동](#목차)

## 오버로딩
> 오버로딩이란, 같은 클래스 내에서 같은 이름의 메서드를 사용하는 기술  
> (단, 매개변수 타입 및 개수가 달라야 함)

예를 들면 다음과 같다.

```java
public class Overloading {
	void plus(int a, int b) {
		System.out.println("a + b: " + (a + b));
	}
	
	void plus(int a, int b, int c) {
		System.out.println("a + b + c: " + (a + b + c));
	}
} 
```

메서드 오버로딩 뿐 아니라 생성자 오버로딩 또한 있다. 생성자 오버로딩의 예로는 인스턴스 생성 방법이 다를 경우를 들 수 있다. 이를 테면 직원 관리 프로그램에서 초기화 시 생성자와 직원 추가 시 생성자가 다를 수 있다([코드 참고](https://github.com/nara1030/EmployeeManagementSystem/blob/master/src/empSystem/src/main/java/com/eom/model/Employee.java)).

##### [목차로 이동](#목차)

### 메서드 시그니처
오버로딩을 구현하기 위해서는 **메소드명은 같게, 인자 타입 및 개수는 다르게** 해주어야 한다. 다시 말해 메소드 시그니처(Method signature)를 다르게 해주어야 한다.

* [메서드 시그니처](https://wanna-b.tistory.com/75)(Method signature)란
	* `메서드 이름`과 `매개변수 리스트`
		* 자바 컴파일러는 [메서드 이름과 매개변수 리스트](https://stackoverflow.com/questions/16149285/does-a-methods-signature-in-java-include-its-return-type)를 통해 메서드 간 차이를 식별(`오버로딩`)  
		<img src="../../img/overload_compiler.png" width="400" height="300"></br>

##### [목차로 이동](#목차)

## 오버라이딩
> 상속 관계가 있는 클래스 간에 같은 이름의 메소드를 정의하는 기술

[개요](#개요)에서 오버라이딩의 경우 리턴 타입이 **원칙적으론** 동일하다고 했다. 이게 무슨 뜻일까?

* [다형성에 입장에서 생각](https://bitsoul.tistory.com/55)해보면, 리턴 타입은 재정의 가능해야 함(`오버라이딩`)
	* 원칙적으로 상속 관계에서 메소드 오버라이딩은 `리턴타입`, `메소드 이름`, `매개변수 리스트`가 완전히 동일해야 함
	* 그러나 `리턴타입`에 있어서는 다형성 때문에 자동 형변환이 발생할 수 있다면 재정의 허용

##### [목차로 이동](#목차)

## 참고


##### [목차로 이동](#목차)
