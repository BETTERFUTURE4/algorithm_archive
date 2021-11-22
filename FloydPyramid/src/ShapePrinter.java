public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int num = 1;
        int maxLength = Integer.toString(height * (height + 1) / 2).length();
        int numLength;
        
        for (int row = 1; row <= height; row++) {
            String line = "";
            for (int col = 0; col < row; col++) {
                numLength = Integer.toString(num).length();

                for (int k = 0; k < (maxLength - numLength); k++) {
                    line += " ";
                }

                line += num + " ";
                num++;
            }
            System.out.println(line);
        }
    }
}