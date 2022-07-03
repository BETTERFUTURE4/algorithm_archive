public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 원소가 0개 또는 1개면 0 리턴
        if (intArray.length < 2) {
            return 0;
        }
        int max = intArray[0];
        int min = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }

            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return max - min;
    }
}