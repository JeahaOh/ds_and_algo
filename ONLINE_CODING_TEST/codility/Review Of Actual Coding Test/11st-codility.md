# 11번가 + Codility 코테 회고

- 100분에 3문제, 처음 보는 코테이기 때문에 난이도는 잘 모르겠음.  
- 당황 했던 점은 js의 간편한 문법 때문에 코테는 js 만 공부했는데, 응시 가능한 언어가 C, Go, Java 8 || 11, Kotlin, Python, Scala, SQL... 아마 11st BE에서 자바를 쓰기 때문에 js를 제외한 것이 아닐까 싶음.
- 포기 할까 했지만 어쨌거나 경험++을 해야하는 입장에서는 문제를 다 풀어야 했음.
- 영어 + 수학 + java 3콤보로 정신이 아득해짐...

## 테스트 문제

- 조건
  - 랜덤한 길이의 정수를 담은 배열이 주어짐
  - 해당 배열은 오름차순 정렬이 가능하고, 중간에 빠진수를 찾아서 반환하면 됨.
  - 결과는 0보다 큰 정수로 반환해야함
  - 30분 제한시간 내에 해결 못함

## 문제 1

- 테스트 문제 해결 실패로 멘붕...
- 조건
  - 주어진 정수 N의 각 자리수를 분리, 각각의 수를 모두 더한 K 값과 같은 N보다 큰 M을 구하는 문제
  - N이 28이라면 -> [2, 8]으로 분리
  - 2 + 8 = 10
  - 28 보다 큰 수 중, 각 자리수의 합이 10인 수는 37 -> 3 + 7 = 10
- js 문법에 익숙하다 보니 java stream을 사용해서 문자열 변환 -> 문자열 배열 -> 정수 변환 = 정수 배열로 만들었는데,  
  내 기억으로는 stream이 시간 효율이 안 좋기 때문에 성능에서 FAIL일 것 같음.
- 지문에 `focus on correctness. The perfomance of your solution will not be the focus of the assessment.`라고 나와 있어서 괜찮지 않을까 싶음. 정확도는 그래도 100% 나오지 않았을까?

## 문제 2

- 조건
  * A : 비어있지 않은, N개의 길이를 가진 배열.
  * K : 해당 배열에 포함되어있는지 확인해야 할 수.
  * K 가 없다면 false, 있다면 true를 반환해야 함.
  * 이미 작성된 코드에서 버그픽스 하라. 최대 두 줄만 수정 가능함.
- 기본 메소드가 각 요소는 1 차이인지 확인은 가능하지만, K가 포함되어 있는지 확인하는 부분이 빵꾸가 나있다고 판단했음.
- java에서 contain를 2줄만 수정해서 확인하는 방법이 stream 이용하는 방법 말고는 생각이 안나서 import를 line 안에 넣었음.
  - 정답이 아니고 편법일 거라 생각함
- 그리고 기본적으로 stream이 단순 반복문 보다 느린 것도 있지만,  
  어쨌든 배열을 다 확인하는 로직이 한번 더 추가되는 것이기 때문에 효율성에서 FAIL일 듯..

## 문제 3

- 앞의 2 문제로 시간이 40분 정도 남았었음.
- 테이블 2개가 있고, 이를 join 후 group by로 묶어서 값을 합산해야 하는 문제였음.
- postgreSQL가 ORACLE DB랑 문법이 비슷한 걸로 착각해서 NULL 처리하는데 시간을 잘못 소비함.
- 테이블 구조를 잘못 생각해서 group by 한 후, join을 해서 query 결과가 잘못됨.
- 5분 남겨놓고 수정하려 했으나, 실패

## 회고

- 앞에서는 난이도 모르겠다고 했지만 회고 해보니 난이도는 낮은 편이라고 생각 함. js로 풀었으면 1, 2는 금방 했을 거 같음.
  - 아직 프로그래머스 1레벨 푸는 중이긴 하지만 프로그래머스 1 ~ 2렙 사이 아닐까 싶음.
- 실패 요인은 당연히 공부가 부족한 것 일 테고, (영어, java, algorithm)
- 코테는 js로만 준비했던게 또 다른 실패 요인이라고 생각 함.
  - 여기서 멘탈이 많이 털림
  - java stream도 사실 태어나서 처음 써봄....
  - 차라리 python을 공부했어야 하나 싶기도 함
- 지금까지 일하면서 java, js 만 했지만, 솔직히 말해서 지금까지 일 한곳이 다 정상적인 코드가 없어서 java 실력이 많이 모자라다 싶음. 어쩌면 1.8 문법부터 다시 공부해야 하나 싶음

## 고민 해봐야 할 것

- 영어 코테나 수학문제도 대비해야할 것 같고, 간단한 구현 문제 해결하는데 집중적으로 공부하고 있는데, 공부하는 방법을 바꿔야 하나?
- BE 코테면 당연히 java로 준비를 해야하는가?