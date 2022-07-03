public class Seat {
    // 여기에 코드를 작성하세요.
    // 예약자 이름을 담습니다.
    private String name = null;

    // 예약자 이름을 리턴합니다.
    public String getName() {
        return name;
    }

    // 예약자 이름을 설정해줍니다.
    public void reserve(String name) {
        this.name = name;
    }

    // 예약자 이름을 없애줍니다. name을 다시 null로 설정
    public void cancel() {
        name = null;
    }

    // 이미 예약된 자리인지 불린값을 리턴
    public boolean isOccupied() {
        return name != null;
    }

    // checkName이라는 이름으로 예약된 자리인지 확인하고, 불린값을 리턴해줍니다.
    public boolean match(String checkName) {
        return name.equals(checkName);
    }
}