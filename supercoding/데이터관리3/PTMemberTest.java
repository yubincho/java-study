package supercoding.데이터관리3;

import supercoding.데이터관리1.PTMember;

public class PTMemberTest {

    public static void main(String[] args) {

        supercoding.데이터관리3.PTMember member = new supercoding.데이터관리3.PTMember("민철", 178, 70, "남자");

        try {
            member.setID("akjsfkasssss");  // ID 길이는 8자 이상 20자 이하여야 합니다.

        } catch (Exception e) {
            // 고객에게 알람 보내기
        }
        System.out.println(member);

    }
}
