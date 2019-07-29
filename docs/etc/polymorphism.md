다형성: 인터페이스와 리플렉션
=====
리플렉션보다는 인터페이스를 사용하라
- - -
## 목차
1. [개요](#개요)
2. [인터페이스](#인터페이스)
	* 상속보다는 합성
3. [리플렉션](#리플렉션)
	* 어노테이션과 리플렉션
4. [결론](#결론)
	* 리플렉션보다는 인터페이스
5. [참고](#참고)

## 개요
[`리플렉션`보다는 `인터페이스`를 사용하라](https://jaehun2841.github.io/2019/03/03/effective-java-item65/#%EC%84%9C%EB%A1%A0)라는 글을 접하고 이해한대로 정리해보고자 한다. 이 두 개념을 같은 층위에 놓고 비교했고, 나는 아래 개념을 그 기준점으로 삼았다.  

* 다형성이란
	* 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함을 구현하는 데 사용
	* 개인적으로 위 주제(`리플렉션보단 인터페이스`)의 문맥에서 생각해보면 다형성이란 런타임 시 동적 바인딩(ex. 메소드 오버라이딩) 같음(`객체 지향에서의 다형성이 더 큰 개념인지 모르겠음`)
	* 참고
		* [위키백과 - 다형성](https://ko.wikipedia.org/wiki/%EB%8B%A4%ED%98%95%EC%84%B1_(%EC%BB%B4%ED%93%A8%ED%84%B0_%EA%B3%BC%ED%95%99))
		* [제타위키 - 다형성](https://zetawiki.com/wiki/%EB%8B%A4%ED%98%95%EC%84%B1)
* 다형성을 구현하는 방법
	* 인터페이스(상속/구현)
	* 리플렉션

**좀 더 깊이**

* [메서드 시그니처](https://wanna-b.tistory.com/75)(Method signature)란
	* `메서드 이름`과 `매개변수 리스트`
	* 왜 `리턴타입`은 빼고 이 두 가지만?
		* 자바 컴파일러는 메서드 이름과 매개변수 리스트를 통해 메서드 간 차이를 식별(`오버로딩`)
		* .
	
##### [목차로 이동](#목차)
	
## 인터페이스
* 인터페이스란(두 가지 측면에서 생각할 수 있음)
	1. 사용자가 사용할 수 있는 일종의 API
		* 하나의 인터페이스를 구현한 두 개의 서로 다른 구현체는 그 사용 방법은 동일(ex. Set과 List)
	2. 해당 인터페이스를 구현한 어떠한 구현체도 참조 가능하다는 점에서 다형성의 수단

**좀 더 깊이**
	
* 상속 vs 합성
	* gimmesilver's blog
		* [상속과 합성 - (1)](http://agbird.egloos.com/615107)
		* [상속과 합성 - (2)](http://agbird.egloos.com/615166)
		* [상속과 합성 - (3)](http://agbird.egloos.com/615237)
	* [객체지향 프로그래밍 입문 by cheese10yun](https://github.com/cheese10yun/TIL/blob/master/OOP/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%9E%85%EB%AC%B8.md)
	* 인터페이스 vs 추상클래스
	
##### [목차로 이동](#목차)
	
## 리플렉션

##### [목차로 이동](#목차)

## 결론

* 팩토리패턴


## 참고


* [리플랙션보다는 인터페이스를 사용하라](https://jaehun2841.github.io/2019/03/03/effective-java-item65/#%EC%84%9C%EB%A1%A0)

* [자바 어노테이션과 리플렉션이란?](https://qssdev.tistory.com/27)
* [어노테이션과 리플렉션을 이용한 메소드 실행시간 출력하기](https://118k.tistory.com/106)

* 팩토리 패턴과 리플렉션
	* [리플랙션 패턴](https://m.blog.naver.com/PostView.nhn?blogId=since890513&logNo=220220758867&proxyReferer=https%3A%2F%2Fwww.google.com%2F)
	* [Factory Pattern](https://www.oodesign.com/factory-pattern.html)
	* [Abstract Factory, Factory Method vs Reflection](https://www.linkedin.com/pulse/abstract-factory-method-vs-reflection-eman-mughal/)
	* [Factory via Reflection](http://technojeeves.com/index.php/65-java-factory-via-reflection-and-properties)