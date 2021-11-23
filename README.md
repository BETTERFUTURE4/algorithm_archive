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
### 12. 포켓몬GO
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
### 13. 영화관 '코드박스' 예약 시스템
* Main : 메인 클래스
* Seat
  * (1) private String name
    * 예약자 이름을 담습니다.
  * (2) public String getName()
    * 예약자 이름을 리턴합니다.
  * (3) public void reserve(String name)
    * 예약자 이름을 설정해줍니다.
  * (4) public void cancel()
    * 예약자 이름을 없애줍니다. 
    * name을 다시 null로 설정하는 것이죠!
  * (5) public boolean isOccupied()
    * 이미 예약된 자리인지 불린값을 리턴해줍니다.
  * (6) public boolean match(String checkName)
    * checkName이라는 이름으로 예약된 자리인지 확인하고, 
    * 불린값을 리턴해줍니다.
* Theater
  * (1) private Seat[][] seats;
    * 전체 좌석을 표현하는 2차원 Seat 배열입니다.
  * (2) private int rowCount, colCount;
    * 전체 좌석의 행(row)과 열(col)의 수를 담는 변수입니다.
  * (3) public Theater(int rowCount, int colCount)
    * Theater 클래스의 생성자입니다. 
    * 파라미터로 받은 열과 행의 수에 해당하는 2차원 배열을 만들고, 
    * Seat 클래스의 인스턴스들로 배열을 채워줍니다. 
    * 모든 Seat 인스턴스는 서로 달라야 합니다. 
    * 총 rowCount * colCount개의 인스턴스가 필요하겠죠?
    * 또, 파라미터로 받은 변수들의 값을 
    * 각각 동일한 이름의 내부 인스턴스 변수에 넣어줍니다. 
    * 예를 들어서 rowCount는 this.rowCount에 넣어줘야 하겠죠?
  * (4) public void printSeatMatrix()
    * 좌석 정보를 출력하는 메소드입니다.
  * (5) public boolean reserve(String name, char rowChar, int col, int numSeat)
    * 예약 정보(이름, 열, 행, 예약 좌석 수)를 파라미터로 받아 
    * 예약하는 메소드입니다.
    * 입력받은 rowChar를 배열의 index로 사용하기 위해  
    * getRowIndex 메소드를 이용하세요!
  * (6) public int cancel(String name)
    * 이름 name으로 예약된 자리를 취소하고, 
    * 취소된 좌석의 수를 리턴합니다. 
  * (7) public int cancel(char rowChar, int col, int numSeat)
    * 메소드 오버로딩으로 구현한 또 다른 cancel 메소드입니다. 
    * 이번에는 파라미터로 받는 '열', '행', '좌석 수'에 해당되는 
    * 모든 좌석의 예약을 취소합니다. 
    * 그리고 위의 cancel 메소드와 마찬가지로 
    * 총 취소된 좌석 수를 리턴합니다.
  * (8) public int getNumberOfReservedSeat()
    * 예약된 모든 좌석 수를 리턴하는 메소드입니다.
  * (9) private int getRowIndex(char uppercaseChar)
    * 영화관 행을 그에 해당하는 정수로 변환하는 메소드입니다. 
    * 예를들어 'A'는 0, 'D'는 3으로 변환해줍니다. 