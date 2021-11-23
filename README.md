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