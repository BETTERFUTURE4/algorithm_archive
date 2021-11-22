public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 코드를 입력하세요.
        int answer = 0;
        // 원소가 0개 또는 1개면 0 리턴
        if (intArray.length < 2) {
            return 0;
        }
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int ii = i + 1; ii < intArray.length; ii++) {
                int difference = Math.abs(intArray[i] - intArray[ii]);
                if(difference > answer) {
                    answer = difference;
                }
            }
        }
        return answer;
    }
}