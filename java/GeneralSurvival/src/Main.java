import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
        ArrayList<Integer> member = new ArrayList<>();
        // 멤버 추가
        for (int memberIndex = 1; memberIndex <= n; memberIndex++) {
            member.add(memberIndex);
        }
        // 변수 인덱스 선언
        int killMemberIndex = 0;
        
        // 한명씩 죽이기
        while (member.size() > 1) {
            killMemberIndex = (killMemberIndex + k-1) % member.size();
            System.out.println(member.remove(killMemberIndex) + "번 군사가 죽습니다.");
        }
        // 마지막 자리 리턴
        return member.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}