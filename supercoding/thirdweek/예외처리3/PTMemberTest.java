package supercoding.thirdweek.예외처리3;

public class PTMemberTest {

    public static void main(String[] args) {

        PTMember member = new PTMember("민철", 178, 70, "male");
//        member.setID(null);
        try {
            member.setID("akjsfk");  // ID 길이는 8자 이상 20자 이하여야 합니다.

        } catch (Exception e) {
            // 고객에게 알람 보내기
        }
        System.out.println(member);

    }
}
