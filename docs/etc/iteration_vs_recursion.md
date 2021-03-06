반복 vs. 재귀
=====
[코드스피츠 강의](https://www.bsidesoft.com/?p=4314#%25ea%25b2%25b0%25eb%25a1%25a0)에서 언급되었던 부분이고 공부의 필요성을 느껴 작성한다.

* 반복문을 사용하는 코드는 항상 재귀함수를 통해 구현 가능하며 그 반대도 가능
* 이 전환을 자연스럽게 할 수 있도록 익숙해지는 것이 목표
- - -
## 목차
1. [개요](#개요)
	* 문제점과 필요성
2. [재귀함수](#재귀함수)
	* [개념](#개념)
	* [배경](#배경)
3. [예시](#예시)
	* [기본](#기본)
		* [구구단](#구구단)
		* 팩토리얼
		* 별찍기
		* 하노이 탑
		* 피보나치 수열
	* [객체지향에서의 재귀](#객체지향에서의-재귀)
4. [참고](#참고)

## 개요
이 개념들은 같은 문제를 해결하는 두 방법이기에 장단이 있다.

* 재귀(`Recursion`)
	* 코드의 양 감소
* 반복(`Iteration`): for문
	* 메모리 적게 차지하며 속도에서 유리

이하 추후 추가

* [재귀호출과 동적 프로그래밍](http://egloos.zum.com/kuphy00/v/2472789)
* [재귀의 문제점](https://itance.tistory.com/entry/%EC%9E%AC%EA%B7%80%EC%9D%98-%EB%AC%B8%EC%A0%9C%EC%A0%90)
* [재귀함수를 쓰는 이유](https://medium.com/sjk5766/%EC%9E%AC%EA%B7%80%ED%95%A8%EC%88%98%EB%A5%BC-%EC%93%B0%EB%8A%94-%EC%9D%B4%EC%9C%A0-ed7c37d01ee0)
	
##### [목차로 이동](#목차)
	
## 재귀함수
영어로는 `Recursive function`이라 한다.
	
### 개념
정의는 아래와 같다.

* 하나의 `함수`에서 자신을 다시 호출하여 작업을 수행하는 방식으로 주어진 문제를 푸는 방법
* `재귀 호출` 혹은 `되부름`이라고 불리기도 함

개략적인 원리는 아래와 같다.

* 입력값의 변화가 없거나 입력값의 변화가 특정 패턴을 반복하게 되면 그 재귀함수는 영원히 반복
	* 다시 말해, `콜스택 초과`로 프로그램이 뻗어버림
* 따라서 재귀함수 설계 시에는 입력값이 종료 조건으로 수렴하는지 꼭 검증 필요
	* 실제 재귀함수가 쓰이는 곳에서는 매 호출시마다 입력값(파라메터)이 변함

##### [목차로 이동](#목차)

### 배경
> 루프문과 변수를 이용하는 반복적 알고리즘(`반복문`)은 재귀함수로 표현할 수 있고 그 역도 성립한다.

이 ~~수학적~~ 사실에 영향을 받아서 등장한 것이 함수형 언어이고, 이는 재귀를 밥먹듯 사용한다. 하지만 현재 산업에서의 언어 패러다임은 대부분 명령형이기 때문에 대개 반복문으로 구현하는 것이 훨씬 익숙하다. 무엇보다 함수가 호출될 때마다 호출 스택 메모리를 잡아먹는 경우 퍼포먼스 측면에서 반복문이 낫다.

단 [명령형 언어](#언어별-재귀)에서도 재귀가 필요할 때가 있는데, 반복문으로 구현했다가는 코드가 심하게 복잡해지거나, 프로그래머가 만들다가 로직이 꼬이는 문제들도 있기 때문이다. 예를 들어 XML이나 JSON을 파싱한다거나 퀵 정렬을 만든다면 반복문보다 재귀를 쓰는 것이 더 쉽다. 이런 경우 생 루프문으로 처리하려면 스택을 구현해야 한다.

#### 언어별 재귀
대부분의 명령형 언어 구현체에서는 간단한 재귀함수를 몇 줄 차이뿐인 반복문으로 쓰는 것이 더 좋은 관계로(`주요 구현체 중 꼬리재귀 최적화가 없는 경우가 있기 때문. 대표적으로 Java는 꼬리재귀 최적화가 없음`) 절차적 언어에서의 재귀를 써야하는 경우는 매우 적다.

그래도 객체지향 언어에서는 일반적인 명령형 언어에 비해서 재귀함수를 사용하기 편하다. 클래스가 같은 클래스를 참조하면 클래스 단위로 재귀함수를 처리할 수 있기 때문이다. 특히 [트리 구현](#객체지향에서의-재귀)에서 주로 사용하는 방식이다.

반면에 함수형 언어로 가면 상황은 많이 180도 달라지는데, 많은 함수형 언어 구현체에는 루프문이 없을 뿐더러 애초에 필요성도 못 느낀다. ~~추후 추가~~

- - -
참고로 프로그래밍 패러다임(분류 및 그 구현체)에 관해 정리하면 다음과 같다.

```
└─프로그래밍
  ├─명령형 프로그래밍
  │  ├─절차적: C
  │  └─객체 지향: C++, Java
  └─선언형 프로그래밍
     ├─함수형: Haskell
     └─논리형
```
자세한 부분은 [여기](programming_paradigm.md)를 참고한다.

##### [목차로 이동](#목차)

## 예시
### 기본
#### 구구단
이후 추후 추가

* [구구단](https://gomguard.tistory.com/111)

##### [목차로 이동](#목차)

### 객체지향에서의 재귀
코드스피츠 강의(`컴포지트 패턴`)에서도 들었던 것 같은데, 위키에서도 다음과 같이 언급하고 있다.

> 문서의 제목은 `재귀함수`이지만, 연결리스트나 트리와 같은 자료구조는 자신을 통해 정의된다는 점에서 `재귀적인 자료구조`이다.

이하 추후 추가

* [트리구조와 재귀호출](https://www.i-swear.com/677)

##### [목차로 이동](#목차)

## 참고
* [재귀호출을 반복문으로 바꾸기 - 코드스피츠](https://www.bsidesoft.com/?p=4314#%25ea%25b2%25b0%25eb%25a1%25a0)
* [Recursion vs. Iteration](https://newstars.tistory.com/17)
* [재귀함수 - 나무위키](https://namu.wiki/w/%EC%9E%AC%EA%B7%80%ED%95%A8%EC%88%98)
* [재귀 함수를 비재귀 함수로 바꾸기 - Gurubee](http://wiki.gurubee.net/pages/viewpage.action?pageId=1507916)

##### [목차로 이동](#목차)