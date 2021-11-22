public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int num = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println("print Tri");
    }
}