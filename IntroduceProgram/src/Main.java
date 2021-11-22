import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("(I)ntro (C)ourses (E)xit");
            String code = scanner.next();

            if(code.equals("e") || code.equals("E")){
                System.out.println("안녕히 가세요.");
                break;
            }if(code.equals("i") || code.equals("I")){
                System.out.println("안녕하세요! 우리는 코드잇입니다. \n " +
                        "함께 공부합시다!");
                continue;
            }if(code.equals("c") || code.equals("C")){
                while (true){
                    System.out.println("코드잇 수업을 소개합니다.\n" +
                            "(P)ython (J)ava (i)OS (B)ack");
                    code = scanner.next();

                    if(code.equals("b") || code.equals("B")){
                        break;
                    }if(code.equals("p") || code.equals("P")){
                        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                "강사: 강영훈\n" +
                                "추천 선수과목: 없음");
                        continue;
                    }if(code.equals("j") || code.equals("J")){
                        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                "강사: 김신의\n" +
                                "추천 선수과목: Python");
                        continue;
                    }if(code.equals("i") || code.equals("I")){
                        System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                "강사: 성태호\n" +
                                "추천 선수과목: Python, Java");
                        continue;
                    }
                    System.out.println("다시 입력해주세요");
                }
                continue;
            }
            System.out.println("다시 입력해주세요");
        }
    }
}
