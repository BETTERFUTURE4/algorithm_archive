public class Theater {

    // 전체 좌석을 표현하는 2차원 Seat 배열입니다.
    private final Seat[][] seats;
    // 전체 좌석의 행(row)과 열(col)의 수를 담는 변수입니다.
    private final int rowCount, colCount;

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

    // 예약 정보(이름, 열, 행, 예약 좌석 수)를 파라미터로 받아 예약하는 메소드
    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        //존재하지 않는 행 또는 열을 입력하면 false를 리턴하고 메소드를 종료
        int rowNum = getRowIndex(rowChar);
        if (rowNum >= rowCount || (col-1)+numSeat > colCount) {
            return false;
        }
        // 만약 1열부터 9열까지밖에 없는데, D7부터 네 좌석을 예약하면
        // false를 리턴하고 메소드를 종료합니다.
        for (int c = col-1; c < (col-1) + numSeat ; c++) {
            if (seats[rowNum][c].isOccupied()) {
                return false;
            }
        }
        // 문제가 없는 경우, 실제로 예약을 하고 true를 리턴합니다.
        for (int c = col-1; c < (col-1) + numSeat ; c++) {
            seats[rowNum][c].reserve(name);
        }
        return true;
    }

    // 이름 name으로 예약된 자리를 취소하고, 취소된 좌석의 수를 리턴
    public int cancel(String name) {
        int cancelCount = 0;
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (seats[row][col].getName() != null && seats[row][col].match(name)) {
                    seats[row][col].cancel();
                    cancelCount++;
                }
            }
        }
        return cancelCount;
    }

    //메소드 오버로딩으로 구현한 또 다른 cancel 메소드입니다.
    // 이번에는 파라미터로 받는 '열', '행', '좌석 수'에 해당되는 모든 좌석의 예약을 취소합니다.
    // 그리고 위의 cancel 메소드와 마찬가지로 총 취소된 좌석 수를 리턴합니다.
    public int cancel(char rowChar, int col, int numSeat) {
        int cancelCount = 0;
        int row = getRowIndex(rowChar);

        for (int colIndex = col - 1; colIndex < (col - 1) + numSeat; colIndex++) {
            if (row < rowCount && colIndex < colCount && seats[row][colIndex].isOccupied()){
                seats[row][colIndex].cancel();
                cancelCount ++;
            }
        }
        return cancelCount;
    }

    // 예약된 모든 좌석 수를 리턴하는 메소드입니다.
    public int getNumberOfReservedSeat() {
        int reservedCount = 0;
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.isOccupied()) {
                    reservedCount ++;
                }
            }
        }
        return  reservedCount;
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
    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}