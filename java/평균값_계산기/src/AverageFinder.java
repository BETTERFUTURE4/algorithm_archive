public class AverageFinder {
    double computeAverage(int[] intArray) {
        // 코드를 입력하세요.
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return (double) sum / intArray.length;
    }
}