static vs. non-static
=====
## 목차
1. [개요](#개요)
2. [static 멤버](#static-멤버)
3. [인스턴스 멤버](#인스턴스-멤버)
4. [참고](#참고)

## 개요
static 멤버를 사용하면서 오해했던 부분은 클래스 간 공유가 된다고 생각했던 점(∵ static 멤버는 동일한 클래스의 모든 객체들에 의해 공유)이다. 아래는 코딩하며 오해했었던 부분들인데 기록으로 남겨둔다.

* 잘못된 사용 예시 1  
	<img src="../../img/static_load_time.png" width="600" height="400"></br>
* 잘못된 사용 예시 2  
	<img src="../../img/static_1.png" width="800" height="350"></br>
	<img src="../../img/static_2.png" width="800" height="350"></br>

즉, 클래스 간 공유를 위해서는 메서드 반환 타입을 통해 해당 클래스 필드를 변경시켜주어야 한다. 한편 멤버 선언 시 static과 non-static 중 어느 것으로 선언해야 할지 혼동되는 부분이 있어서 정리해보고자 한다.

##### [목차로 이동](#목차)

## static 멤버


##### [목차로 이동](#목차)


## 인스턴스 멤버


##### [목차로 이동](#목차)

## 참고
* [static 멤버와 static 메서드](https://gmlwjd9405.github.io/2018/08/04/java-static.html)
* [동적인 클래스 로딩과 ClassLoader](https://javacan.tistory.com/entry/1)

##### [목차로 이동](#목차)
