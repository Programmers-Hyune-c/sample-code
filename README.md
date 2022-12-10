# sample-code

## if-else 를 통한 랜덤 enum 생성

### v1

- `BATTING_CASE_COUNT` 값과 batting enum 의 case count 가 맞지 않는 오류 수정
- 테스트 케이스 추가
    - 충분히 큰 회수의 반복으로 batting 의 가지 수가 모두 나오는지 확인
- ordinal 에 의존하던 로직을 value 로 개선하고 enum 으로 응집

### v2

- 실무라고 생각하고 코드 개선
- 학습 목적에서 말하는 `생성 전략의 교체` 는 고려하지 않음
