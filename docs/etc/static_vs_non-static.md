static vs. non-static
=====
둘의 차이를 이해함으로써 올바른 사용법을 이해하는 것이 목적이다.  
지금껏 공간적 특성으로만 바라보고, 시간적 특성은 생각을 못한 것 같다.
- - -
## 목차
1. [계기](#계기)
	* [가설](#가설)
2. [개념](#개념)
3. [연관](#연관)
	* [static 멤버와 thread](#static-멤버와-thread]
4. [출처](#출처)

## 계기
[직원관리 프로그램](https://github.com/nara1030/EmployeeManagementSystem)을 만들며 깨끗한 설계를 위해 Util 클래스(~~거기 넣은 클래스가 진짜 Util인지는 별개로 공통을 분리해놨다~~)를 분리하려고 했다. 하지만 Util 클래스에서 static 멤버를 사용할 수가 없어서 생성 시점에 대해 무지했구나 깨달았다(`아는게 뭘까?-_-;`).

<img src="../../img/static_load_time.png" width="600" height="400"></br>

##### [목차로 이동](#목차)

### 가설
위 사진을 계기로 아래와 같은 생각을 해보았다.

> * static 멤버가 생성되는 시점은 main() 메서드가 실행을 시작한 후 첫 단어가 등장하는 시점
> * ~~따라서 API 클래스에서는 static 멤버 사용 불가~~

##### [목차로 이동](#목차)

## 개념
* `non-static` 멤버
	* .
* `static` 멤버
	* .

##### [목차로 이동](#목차)


## 연관

### static 멤버와 thread


##### [목차로 이동](#목차)

## 출처
* [자바 - static 멤버와 static 메서드](https://gmlwjd9405.github.io/2018/08/04/java-static.html)
* [자바 - 동적인 클래스 로딩과 ClassLoader](https://javacan.tistory.com/entry/1)

##### [목차로 이동](#목차)
