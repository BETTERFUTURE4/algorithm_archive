public class Theater {

    // 전체 좌석을 표현하는 2차원 Seat 배열입니다.
    private Seat[][] seats;
    // 전체 좌석의 행(row)과 열(col)의 수를 담는 변수입니다.
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        // 알파벳은 26개만 존재
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }

        seats = new Seat[rowCount][colCount];

        // 인스턴스들로 배열을 채워줍니다.
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                seats[row][col] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;

    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}