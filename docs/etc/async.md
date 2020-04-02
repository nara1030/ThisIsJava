비동기
=====
* 동기/비동기 개념 정리
* 피드백 환영
- - -
## 목차
1. [개요](#개요)
	* [개념](#개요)
	* [언어](#언어)
		* [자바스크립트](#자바스크립트)
		* .
2. [코드](#코드)
	* [자바](#자바)
	* [자바스크립트](#자바스크립트)
3. [참고](#참고)

## 개요
### 개념
* 동기식 처리 모델(Synchronous processing model): 직렬적으로 태스크(task)를 수행
* 비동기식 처리 모델(Asynchronous processing model): 병렬적으로 태스크를 수행

간단한 예를 들면 아래와 같다.

```txt
// 동기식
1. 아침에 일어난다.
2. 식사를 준비한다.
3. 식사한다.
4. 뉴스를 본다.

// 비동기식
1. 아침에 일어난다.
2. 식사를 준비한다.
3. 식사하며 뉴스를 본다.
```

즉, 동기식의 경우에는 작업이 순차적으로 실행되며 어떤 작업이 수행 중이라면 다음 작업은 대기하게 된다. 반면 비동기식의 경우에는 작업이 종료(완료)되지 않은 상태더라도 다음 작업을 실행할 수 있다. 다시 말해 병렬적으로 태스크를 수행한다.

흔히 이 동기/비동기 개념은 클라이언트/서버 환경에서 언급된다. 즉, 클라이언트 사이드에서 요청 후 서버 사이드에서 응답하는 부분을 비동기 처리하는 식이다. 자바스크립트로 간단한 예를 들어보면 아래와 같다.

```javascript
/*
 * func1
 * func3
 * undefined
 * func2
 */

function func1() {
  console.log('func1');
  func2();
}

function func2() {
  setTimeout(function() {
    console.log('func2');
  }, 0);

  func3();
}

function func3() {
  console.log('func3');
}

func1();
```

각 함수를 작업이라고 볼 수 있는데, 실행 결과를 보면 자바스크립트의 처리 특성상 선후 관계가 있으므로 완벽한 병렬 처리로 볼 수는 없을 것 같다. 그런 면에서 동기는 응답을 받고 나서 다시 송신을 하지만, 비동기는 응답 여부와 관계 없이 전송할 수 있다고 설명할 수 있다. 즉 두 사람의 대화에서 한 사람의 말이 다 끝나고 말을 시작하면 동기이고, 말이 끝났는지 상관없이 말을 하면 비동기라고 할 수 있다(단, 말이 끝나는 시점은 정해져 있음).

요지는 동기/비동기 개념 자체는 클라이언트/서버 환경과 무관하지만 현재 웹개발 특성상 이렇게 설명하는 경우가 많은 것 같다.

- - -
자바스크립트의 대부분의 DOM 이벤트 핸들러, Timer 함수(setTimeout, setInterval), Ajax 요청은 비동기식 처리 모델로 작동한다.

##### [목차로 이동](#목차)

### 언어
언어마다 특성이 다르므로 비동기 처리를 하는 방식도 다르다.

#### 자바스크립트
자바스크립트의 특성을 먼저 살펴보자.

1. Single-threaded
2. Non-blocking
3. Asynchronous
4. Concurrnet

이에 대해 아직 다 이해하진 못하지만 이런 질문이 가능하다. 어떻게 Single-threaded면서 Asynchronous할 수 있을까? 쉽게 이해하기 위해 아래와 같은 상황으로 비유해보자.

```txt
1. 식당에서 저녁을 먹는다.
2. 빵집에 들러 빵을 산다.
3. 이후 커피점에 가서 커피를 주문한다.
```

위 작업들은 순차적으로 진행하면 비효율적이다. 실제로도 저녁을 먹으면서 가게에 전화 주문을 한 후, 기다리지 않고 물건을 받아갈 수 있을 것이다. 이를 자바에서는 멀티 스레드로 구현한다. 쉽게 말해 처리해야 할 작업이 3개이므로 나의 분신도 3개로 늘려 각각의 작업들을 병렬적으로 처리할 수 있도록 한다. 하지만 자바스크립트는 싱글 스레드 언어이므로 한 명이 각 가게들을 들려 주문 후 번호표를 받고, 물건이 준비되었다는 전달(**Callback**[1])을 받는 식으로 비동기 처리를 진행한다. 흔히 자바와 자바스크립트의 동작 원리가 다르다곤 하는데, 자바는 별도의 스레드를 생성하지 않으면 동기적(순차적)으로 코드가 실행되지만 자바스크립트는 그렇지 않음을 의미하는 말이다.

- - -
* [1]
	* [콜백 함수란?](https://stackoverflow.com/questions/824234/what-is-a-callback-function)  
		```txt
		A callback function is a function which is:
		  * accessible by another function, and
		  * is invoked after the first function if that first function completes
		```
	* [콜백 함수 예시](https://stackoverflow.com/questions/2190850/create-a-custom-callback-in-javascript)

##### [목차로 이동](#목차)

## 코드
위에서 언어 특성에 대해 개략적으로 살펴봤는데, 간단한 코드를 작성해보면서 그 차이를 이해해보고자 한다. 아래와 같은 플로우를 생각해볼 수 있다.

```txt
1. 07:00 - 기상
2. 07:10 - 식사 & 뉴스
3. 07:30 - 씻기
4. 08:00 - 출근 & 독서(외부 리소스)
5. 09:00 ~ 11:00 - 업무(15분마다 표시)
6. 10:00 - 회의 참석
```

### 자바
https://okky.kr/article/592455

##### [목차로 이동](#목차)

### 자바스크립트


##### [목차로 이동](#목차)

## 참고
* [동기식 처리 모델 vs 비동기식 처리 모델](https://poiemaweb.com/js-async)
* [컴퓨터 통신 방식 중 동기/비동기란](https://wikidocs.net/22372)
* JavaScript와 비동기
	1. [Callback이 뭐죠?](https://medium.com/@nemo1275/callback%EC%9D%B4-%EB%AD%90%EC%A3%A0-5f3c0cc4efce)
	2. [Promise가 뭐죠?](https://medium.com/@nemo1275/promise%EA%B0%80-%EB%AD%90%EC%A3%A0-fdf7de2bc0bf)
	3. [await가 뭐죠?](https://medium.com/@nemo1275/await%EA%B0%80-%EB%AD%90%EC%A3%A0-1332622df251)
* [JS는 어떻게 싱글스레드로 작동되는가?](http://hi-cord.com/contents/js-js%EB%8A%94-%EC%96%B4%EB%96%BB%EA%B2%8C-%EC%8B%B1%EA%B8%80%EC%8A%A4%EB%A0%88%EB%93%9C%EB%A1%9C-%EC%9E%91%EB%8F%99%EB%90%98%EB%8A%94%EA%B0%80)
* [싱글스레드 기반 JS의 비동기적 처리 방법](https://hudi.kr/%EB%B9%84%EB%8F%99%EA%B8%B0%EC%A0%81-javascript-%EC%8B%B1%EA%B8%80%EC%8A%A4%EB%A0%88%EB%93%9C-%EA%B8%B0%EB%B0%98-js%EC%9D%98-%EB%B9%84%EB%8F%99%EA%B8%B0-%EC%B2%98%EB%A6%AC-%EB%B0%A9%EB%B2%95/)
* [어쨌든 이벤트 루프는 무엇입니까? - Philip Roberts](https://www.youtube.com/watch?v=8aGhZQkoFbQ)
* [JavaScript - single threaded, non-blocking, asynchronous, concurrent language](https://medium.com/@theflyingmantis/javascript-single-threaded-non-blocking-asynchronous-concurrent-language-ffae97c57bef)

##### [목차로 이동](#목차)