인터페이스 vs 추상클래스
=====
## 목차
1. [개요](#개요)
2. [추상 클래스](#추상-클래스)
3. [인터페이스](#인터페이스)
4. [참고](#참고)

## 개요
자바 8에서 인터페이스 스펙 변경(defalut 키워드를 이용해 일반 메소드 구현 가능)이 있었다. 이에 따라 추상 클래스가 더 이상 필요없어지지 않았나 하는 말도 나왔다. 이에 두 개념의 차이 및 용례를 살펴보고자 글을 적어본다.

두 개념을 구분하기 힘든 이유는 하는 일(추상 메소드 구현 강제)이 비슷하기 때문이지만 그 존재 목적이 다르다.

> 추상 클래스의 목적은 그 추상 클래스를 상속받아서 기능을 이용하고, 확장시키는 데 있다. 반면 인터페이스는 함수의 껍데기만 가지고 있는데, 구현을 강제함으로써 구현 객체의 같은 동작을 보장할 수 있기 때문이다.

추상 클래스의 쓰임을 설명하는 예로 [Servlet 클래스 계층도](https://github.com/nara1030/java-web-programming/blob/master/docs/ch_3.md#Servlet-%ED%81%B4%EB%9E%98%EC%8A%A4-%EA%B3%84%EC%B8%B5%EB%8F%84)를 들 수 있다.

```
<javax.servlet>
	Servlet
	   ↑
   <abstract>
 GenericServlet
	   ↑
   <abstract>
   HttpServlet
```

##### [목차로 이동](#목차)

## 추상 클래스


##### [목차로 이동](#목차)

## 인터페이스


##### [목차로 이동](#목차)

## 참고
* [자바의 추상 클래스와 인터페이스](https://brunch.co.kr/@kd4/6)
* [Interface vs. Abstract Class in Java - HowToDoInJava](https://howtodoinjava.com/oops/exploring-interfaces-and-abstract-classes-in-java/)
* [When (Not) to Use Java Abstract Classes - DZone](https://dzone.com/articles/when-to-use-java-abstract-classes)

##### [목차로 이동](#목차)