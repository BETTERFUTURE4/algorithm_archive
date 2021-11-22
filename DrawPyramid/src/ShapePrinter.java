public class ShapePrinter {
    public void printPyramid(int height) {
        // 코드를 입력하세요.
        for (int i = 1; i <= height; i++) {
            String row = "";
            for (int n = 0; n < height-i; n++) {
                row += " ";
            }
            for (int n = 0; n < 2*i - 1; n++) {
                row += "*";
            }
            System.out.println(row);

        }
    }
}