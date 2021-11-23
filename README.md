# JAVA_STUDY
 자바 복습 스터디 속 프로젝트
## 폴더 설명
### 1. 계좌이체
* BankAccount : 은행 계좌정보를 당은 클래스
* Person : 사용자 정보를 담은 클래스
* BankDriver : 은행 프로그램 실행 클래스(main)
### 2. 특가할인매장
* Main : 메인 클래스
* MarketGood : 매장 제품의 가격정보를 담은 클래스
### 3. 평균값 계산기
* Main : 메인 클래스
* AverageFinder
  * computeAverage() : 파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴
### 4. 두 원소의 차 중 최댓값 구하기
* Main : 메인 클래스
* GreatestDifferenceFinder
  * greatestDifference() : 두 원소의 차이 중 가장 큰 값을 리턴해주는 메소드
### 5. 삼각형 그리기
* Main : 메인 클래스
* ShapePrinter
  * printTriangle() : 
    * 파라미터 : 정수형 height
    * 출력 : 높이 height인 '직각 이등변 삼각형' println
### 6. 피라미드 그리기
* Main : 메인 클래스
* ShapePrinter
  * printPyramid() :
    * 파라미터 : 정수형 height
    * 출력 : 높이 height인  '피라미드' println
### 7. 플로이드의 삼각형
* Main : 메인 클래스
* ShapePrinter
  * printFloydsPyramid() :
    * 파라미터 : 정수형 height
    * 출력 : 높이 height인  숫자가 순서대로 출력되는 플로이드의 삼각형
    * 큰 자리 수에 맞게 앞칸 띄어쓰기
```java  
  1
  2   3
  4   5   6
  7   8   9  10
 11  12  13  14  15
 16  17  18  19  20  21
 22  23  24  25  26  27  28

```
### 8. 소개 프로그램
* Main : 메인 클래스
  * 인풋값으로 정보 제공
### 9. 유닛컨버터
* Main : 메인 클래스
* UnitConverter
  * 다양한 유닛 변환 메소드(총 6개)
### 10. 김신 장군 살리기
* Main : 메인 클래스
  * getSurvivingIndex() :
    * 파라미터 : 정수 n과 정수 k
    * 김신 장군이 살기 위해 서있어야할 자리(int)를 리턴
      * 배열 사이즈 0될 때까지 반복:
        * 인덱스에 해당하는 멤버를 죽임
        * 인덱스 k칸 앞으로
        * 만약 인덱스가 사이즈보다 크면 사이즈만큼 빼기
### 11. 나의 영어 사전
* Main : 메인 클래스
* WordDictionary
  * addWord() :
    * 파라미터 : String 영단어, String 한글단어
  * find() :
    * 파라미터 : String 영단어
    * 출력 : String 한글단어
### 12. 포겟몬GO
* Main : 메인 클래스
* PokeBag
  * (1) private final 자료형 pokemons = new 자료형();
    * HashMap 강의에서 만들었던 PokeDex에서는 한 마리의 마릴 인스턴스만 담을 수 있었죠? 
    * PokeBag에서는 마릴이라는 key 하나에 여러 마리의 마릴 인스턴스를 담을 수 있습니다. 
    * 이 상황에 적합한 자료형을 생각해 봅시다.
  * (2) public ArrayList<Pokemon> getPokemons(String name)
    * name 이름을 갖고 있는 포켓몬을 모두 가져오는 메소드입니다.
  * (3) public void add(Pokemon pokemon)
    * 과정 (1)에서 구현한 pokemons에 Pokemon을 넣는 메소드입니다.
  * (4) public Pokemon getStrongest(String name)
    * name 이름의 포켓몬 중 가장 강한(cp가 가장 큰) 포켓몬을 가져오는 메소드입니다.
  * (5) public Pokemon getStrongest()
    * 내가 가진 모든 포켓몬 중 가장 강한 포켓몬을 가져오는 메소드입니다. 
    * 내부적으로 (4)번 메소드를 호출하도록 구현해보세요.