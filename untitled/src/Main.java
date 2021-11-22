import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("나이: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("나이는 " + age);

        System.out.println("이름: ");
        String name = scanner.next();

        System.out.println(name + "의 나이는" + age);
    }
}
