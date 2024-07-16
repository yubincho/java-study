package assignment3week_정답아님.fourthDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoom<T extends CollegeStudent> {

    private String classRoomName;
    private Map<String, T> studentMap = new HashMap<>();
    private List<String> studentNames = new ArrayList<>();


    public ClassRoom(String classRoomName) {
        this.classRoomName = classRoomName;
    }


    public void addStudent(T student) {
        studentMap.put(student.getStudentID(), student);
        studentNames.add(student.getStudentName());
    }


    public T getStudentByStudentNumber(String studentID) {
        return studentMap.get(studentID);
    }


    public void printStudentNames() {
        System.out.println("이 클래스 룸(" + this.classRoomName + ")은 학생들 " + studentNames + "가 있습니다.");
    }

}
