# 숫자 야구 게임

## 작업 목록
- InputView
  - [x] 1부터 9까지 입력 받는다.
  - [ ] 3자리의 숫자는 중복 될 수 없다.
- BaseballNumber
  - [x] 1부터 9의 숫자만 허용한다.
- Baseball
  - [x] BaseballNumber 3개를 가진다.
  - [x] BaseballNumber는 중복될 수 없다.
- GameSignal
  - [x] 1이면 게임을 다시 실행한다.
  - [x] 1이외의 숫자는 게임을 종료한다.
- NumberGenerator
  - [ ] 1부터 9까지 숫자 3개를 생성한다.
- BaseballGame
  - [ ] 3자리의 숫자를 생성한다.
  - [ ] 사용자의 입력 번호를 받아 생성한 번호 일치 여부를 판단한다.
  - [ ] 입력 번호와 일치하는 랜덤 번호가 없을 경우 ``낫싱``이란 힌트를 제공한다.
  - [ ] 입력 번호와 랜덤 번호의 위치와 번호가 일치하면 ``스트라이크`` 힌트를 제공한다.
  - [ ] 입력 번호와 랜덤 번호의 위치는 다르고 번호가 일치하면 ``볼`` 힌트를 제공한다.
  - [ ] 입력 번호와 랜덤 생성 번호가 모두 일치하면 게임이 종료된다.
 
## 기능 요구 사항
- 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고,
  그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.

- [예] 상대방(컴퓨터)의 수가 425일 때
    - 123을 제시한 경우 : 1스트라이크, 
    - 456을 제시한 경우 : 1스트라이크 1볼, 
    - 789를 제시한 경우 : 낫싱

- 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
  게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.

- 이같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.

- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수있다.

## 프로그램 실행 결과
```
숫자를 입력해주세요 : 123 
1 스트라이크 1볼
숫자를 입력해주세요 : 145 
1볼
숫자를 입력해주세요 : 671 
2볼
숫자를 입력해주세요 : 216 
1 스트라이크
숫자를 입력해주세요 : 713
3 스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. 
1
숫자를 입력해주세요 : 123
1 스트라이크 1볼
...
```
